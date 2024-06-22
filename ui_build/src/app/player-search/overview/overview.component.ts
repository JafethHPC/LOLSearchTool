import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Component, Input } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { environment } from '../../../environments/environment';
import { MatchHistoryComponent } from './match-history/match-history.component';

@Component({
  selector: 'app-overview',
  standalone: true,
  imports: [MatchHistoryComponent, HttpClientModule],
  templateUrl: './overview.component.html',
  styleUrl: './overview.component.css',
})
export class OverviewComponent {
  @Input() summonerData: any;
  private apiKey: string = environment.apiKey;

  constructor(private route: ActivatedRoute, private http: HttpClient) {}

  ngOnInit() {
    // console.log(this.summonerData);
  }
}
