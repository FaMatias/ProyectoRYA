import { TestBed } from '@angular/core/testing';

import { ValidarTokenGuard } from "./ValidarTokenGuard";

describe('TokenGuard', () => {
  let guard: ValidarTokenGuard;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    guard = TestBed.inject(ValidarTokenGuard);
  });

  it('should be created', () => {
    expect(guard).toBeTruthy();
  });
});
