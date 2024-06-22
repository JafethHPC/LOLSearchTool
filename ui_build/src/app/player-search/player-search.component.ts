import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { ActivatedRoute } from '@angular/router';
import { HeaderComponent } from '../shared/header/header.component';
import { FooterComponent } from '../shared/footer/footer.component';
import { Observable, switchMap } from 'rxjs';
import { environment } from '../../environments/environment';
import { OverviewComponent } from './overview/overview.component';
import { SummonerComponent } from './summoner/summoner.component';

@Component({
  selector: 'app-player-search',
  standalone: true,
  imports: [
    HeaderComponent,
    FooterComponent,
    OverviewComponent,
    SummonerComponent,
    HttpClientModule,
  ],
  templateUrl: './player-search.component.html',
  styleUrl: './player-search.component.css',
})
export class PlayerSearchComponent {
  constructor(private route: ActivatedRoute, private http: HttpClient) {}
  private apiKey: string = environment.apiKey;
  summonerData: any = {};

  ngOnInit() {
    this.route.params.subscribe((params) => {
      const playerName = params['playerName'];

      // Fetch Summoner PUUID
      this.fetchPlayerPUUID(playerName, 'NA1').subscribe((res) => {
        // Fetch Summoner Data
        this.fetchPlayerSummoner(res.puuid).subscribe(
          (summonerResponse: any) => {
            this.summonerData = summonerResponse;
          }
        );
      });
    });
  }

  fetchPlayerPUUID(playerName: string, tagLine: string): Observable<any> {
    const puuidUrl = `https://americas.api.riotgames.com/riot/account/v1/accounts/by-riot-id/${playerName}/${tagLine}?api_key=${this.apiKey}`;
    return this.http.get(puuidUrl);
  }

  fetchPlayerSummoner(puuid: string) {
    const summonerUrl = `https://na1.api.riotgames.com/lol/summoner/v4/summoners/by-puuid/${puuid}?api_key=${this.apiKey}`;
    return this.http.get(summonerUrl);
  }
}
