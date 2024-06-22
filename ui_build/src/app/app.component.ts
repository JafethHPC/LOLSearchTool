import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HeaderComponent } from './shared/header/header.component';
import { PlayerSearchComponent } from './player-search/player-search.component';
import { HomeComponent } from './home/home.component';
import { FooterComponent } from './shared/footer/footer.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
            RouterOutlet, 
            HeaderComponent,
            HomeComponent,
            FooterComponent,
            PlayerSearchComponent,
           ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'ui_build';
}
