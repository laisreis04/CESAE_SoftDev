import { Component } from '@angular/core';
import { MarcacoesListaComponent } from '../../components/marcacoes-lista/marcacoes-lista.component';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [MarcacoesListaComponent],
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {



}
