import { Component, Input } from '@angular/core';
import { environment } from '../../../../environments/environment';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-match-history',
  standalone: true,
  imports: [HttpClientModule],
  templateUrl: './match-history.component.html',
  styleUrl: './match-history.component.css',
})
export class MatchHistoryComponent {
  @Input() summonerData: any;
  private apiKey: string = environment.apiKey;

  constructor(private route: ActivatedRoute, private http: HttpClient) {}

  ngOnInit() {
    this.fetchPlayerMatches(this.summonerData.puuid, 0, 20).subscribe(
      (matchesResponse: any) => {
        matchesResponse.forEach((matchId: string) => {
          this.fetchMatchInfo(matchId).subscribe((matchResponse: any) => {
            console.log(matchResponse.info.gameId);
          });
        });
      }
    );
  }

  fetchPlayerMatches(puuid: string, start: number, count: number) {
    const matchesUrl = `https://americas.api.riotgames.com/lol/match/v5/matches/by-puuid/${puuid}/ids?start=${start}&count=${count}&api_key=${this.apiKey}`;
    return this.http.get(matchesUrl);
  }

  fetchMatchInfo(matchId: string) {
    const matchUrl = `https://americas.api.riotgames.com/lol/match/v5/matches/${matchId}?api_key=${this.apiKey}`;
    return this.http.get(matchUrl);
  }
}
