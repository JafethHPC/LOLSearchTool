import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PlayerSearchComponent } from './player-search.component';

describe('PlayerSearchComponent', () => {
  let component: PlayerSearchComponent;
  let fixture: ComponentFixture<PlayerSearchComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PlayerSearchComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(PlayerSearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
