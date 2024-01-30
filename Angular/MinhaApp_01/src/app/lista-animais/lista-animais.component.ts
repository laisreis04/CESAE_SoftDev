import { Component } from '@angular/core';
import { ListaAnimaisItemComponent } from "../lista-animais-item/lista-animais-item.component";

@Component({
    selector: 'app-lista-animais',
    standalone: true,
    templateUrl: './lista-animais.component.html',
    styleUrl: './lista-animais.component.scss',
    imports: [ListaAnimaisItemComponent]
})
export class ListaAnimaisComponent {

animais: Array<{nome: string, especie:string, raca:string, idade:number}> = [
  { nome: 'Bela',especie: 'Cachorro',raca: 'Labrador',idade: 3},
  {nome: 'Mittens',especie: 'Gato',raca: 'Persa',idade: 2},
  {nome: 'Rocky',especie: 'Hamster',raca: 'Sírio',idade: 1},
  {nome: 'Nina',especie: 'Coelho',raca: 'Mini Rex',idade: 4},
  {nome: 'Whiskers',especie: 'Gato',raca: 'Siamês',idade: 5}
]


}
