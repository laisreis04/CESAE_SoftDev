import { Component } from '@angular/core';
import { MinhaListaItemComponent } from '../minha-lista-item/minha-lista-item.component';

@Component({
  selector: 'app-minha-lista',
  standalone: true,
  imports: [MinhaListaItemComponent],
  templateUrl: './minha-lista.component.html',
  styleUrl: './minha-lista.component.scss'
})
export class MinhaListaComponent {

cidades: Array<{nome: string, pais: string, populacao: number }> = [

{nome:'Porto', pais:'Portugal',populacao:78450},
{nome:'Aveiro', pais:'Portugal',populacao:45450},
{nome:'Barcelona', pais:'espanha',populacao:578450},
{nome:'Porto', pais:'Portugal',populacao:450789},
{nome:'Paris', pais:'França',populacao:58965547},
{nome:'São Paulo', pais:'Brasil',populacao:11548798}

]
}
