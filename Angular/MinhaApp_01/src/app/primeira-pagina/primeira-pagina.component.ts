import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { MeuComponenteComponent } from '../meu-componente/meu-componente.component';

@Component({
  selector: 'app-primeira-pagina',
  standalone: true,
  imports: [MeuComponenteComponent],
  templateUrl: './primeira-pagina.component.html',
  styleUrl: './primeira-pagina.component.scss'
})
export class PrimeiraPaginaComponent {

  title = 'MinhaApp_01';


  meuNomePai: string = 'Pandora';

  contadorPai: number = 0;

  atualizar(valor: number): void{
    this.contadorPai = valor;

  }

}
