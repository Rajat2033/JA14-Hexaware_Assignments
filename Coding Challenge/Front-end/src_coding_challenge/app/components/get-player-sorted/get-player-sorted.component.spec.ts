import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetPlayerSortedComponent } from './get-player-sorted.component';

describe('GetPlayerSortedComponent', () => {
  let component: GetPlayerSortedComponent;
  let fixture: ComponentFixture<GetPlayerSortedComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [GetPlayerSortedComponent]
    });
    fixture = TestBed.createComponent(GetPlayerSortedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
