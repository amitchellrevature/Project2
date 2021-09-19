import { TestBed } from '@angular/core/testing';

import { GameboardService } from 'src/app/services/gameboard.service';

describe('EmployeeService', () => {
  let service: GameboardService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GameboardService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});