import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetAllPlayersComponent } from './get-all-players.component';

describe('GetAllPlayersComponent', () => {
  let component: GetAllPlayersComponent;
  let fixture: ComponentFixture<GetAllPlayersComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [GetAllPlayersComponent]
    });
    fixture = TestBed.createComponent(GetAllPlayersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
