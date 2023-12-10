import { TestBed } from '@angular/core/testing';

import { PlayersServiceService } from './players-service.service';

describe('PlayersServiceService', () => {
  let service: PlayersServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PlayersServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
