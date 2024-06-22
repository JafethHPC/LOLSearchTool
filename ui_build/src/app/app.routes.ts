import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { PlayerSearchComponent } from './player-search/player-search.component';

export const routes: Routes = [
  {
    path: '',
    component: HomeComponent,
  },
  {
    path: 'summoners/:playerName',
    component: PlayerSearchComponent,
  },
];
