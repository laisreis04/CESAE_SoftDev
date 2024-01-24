import { Component } from '@angular/core';
import { RouterOutlet, RouterLink } from '@angular/router';
import { MeuComponenteComponent } from "./meu-componente/meu-componente.component";

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.scss',
    imports: [RouterOutlet, MeuComponenteComponent]
})
export class AppComponent {
  title = 'MinhaApp_01';


  meuNomePai: string = 'Pandora';

  contadorPai: number = 0;

  atualizar(valor: number): void{
    this.contadorPai = valor;

  }
}
