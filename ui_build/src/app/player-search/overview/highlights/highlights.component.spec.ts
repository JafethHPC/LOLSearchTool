import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HighlightsComponent } from './highlights.component';

describe('HighlightsComponent', () => {
  let component: HighlightsComponent;
  let fixture: ComponentFixture<HighlightsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [HighlightsComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(HighlightsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
