import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdatecustomersComponent } from './updatecustomers.component';

describe('UpdatecustomersComponent', () => {
  let component: UpdatecustomersComponent;
  let fixture: ComponentFixture<UpdatecustomersComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [UpdatecustomersComponent]
    });
    fixture = TestBed.createComponent(UpdatecustomersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
