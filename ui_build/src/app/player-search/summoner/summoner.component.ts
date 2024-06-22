import { Component, Input } from '@angular/core';
import { environment } from '../../../environments/environment';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-summoner',
  standalone: true,
  imports: [HttpClientModule],
  templateUrl: './summoner.component.html',
  styleUrl: './summoner.component.css',
})
export class SummonerComponent {
  @Input() summonerData: any;
  private apiKey: string = environment.apiKey;
  private summonerLeague: any;

  constructor(private route: ActivatedRoute, private http: HttpClient) {}

  ngOnInit() {
    console.log(this.summonerData);
    this.fetchPlayerLeague(this.summonerData.id).subscribe((leagueResponse) => {
      this.summonerLeague = leagueResponse;
      console.log(leagueResponse);
    });
  }

  fetchPlayerLeague(summonerId: string) {
    const leagueUrl = `https://na1.api.riotgames.com/lol/league/v4/entries/by-summoner/${summonerId}?&api_key=${this.apiKey}`;
    return this.http.get(leagueUrl);
  }
}
