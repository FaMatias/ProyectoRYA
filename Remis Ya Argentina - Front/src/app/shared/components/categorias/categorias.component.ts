import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-categorias',
  templateUrl: './categorias.component.html',
  styleUrls: ['./categorias.component.scss']
})
export class CategoriasComponent implements OnInit {

  constructor() { }
  termino: string = '';

  ngOnInit(): void {
  }

  buscar(termino){
    console.log(termino)
    }

}
