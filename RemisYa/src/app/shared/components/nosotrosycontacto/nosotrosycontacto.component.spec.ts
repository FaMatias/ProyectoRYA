import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NosotrosycontactoComponent } from './nosotrosycontacto.component';

describe('NosotrosycontactoComponent', () => {
  let component: NosotrosycontactoComponent;
  let fixture: ComponentFixture<NosotrosycontactoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NosotrosycontactoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NosotrosycontactoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
