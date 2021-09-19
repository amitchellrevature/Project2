import { TestBed } from '@angular/core/testing';

import { ArchiveService } from 'src/app/services/archive.service';

describe('EmployeeService', () => {
  let service: ArchiveService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ArchiveService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});