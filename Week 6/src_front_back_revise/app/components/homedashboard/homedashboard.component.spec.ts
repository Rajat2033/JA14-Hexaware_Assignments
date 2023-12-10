import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HomedashboardComponent } from './homedashboard.component';

describe('HomedashboardComponent', () => {
  let component: HomedashboardComponent;
  let fixture: ComponentFixture<HomedashboardComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [HomedashboardComponent]
    });
    fixture = TestBed.createComponent(HomedashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
