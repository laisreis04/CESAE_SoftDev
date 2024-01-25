import { Component } from '@angular/core';
import { RouterLink, RouterLinkActive, RouterOutlet } from '@angular/router';
import { MeuComponenteComponent } from '../meu-componente/meu-componente.component';

@Component({
  selector: 'app-segunda-pagina',
  standalone: true,
  imports: [RouterOutlet, RouterLink, RouterLinkActive, MeuComponenteComponent],
  templateUrl: './segunda-pagina.component.html',
  styleUrl: './segunda-pagina.component.scss'
})
export class SegundaPaginaComponent {

}
