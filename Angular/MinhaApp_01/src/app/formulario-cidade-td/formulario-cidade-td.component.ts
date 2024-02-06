import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CidadesService } from '../services/cidades-ls.service';

@Component({
  selector: 'app-formulario-cidade-td',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './formulario-cidade-td.component.html',
  styleUrl: './formulario-cidade-td.component.scss'
})
export class FormularioCidadeTdComponent {

id: number = 0;
nomeCidade: string= '';
paisCidade: string= '';
populacaoCidade: number= 0;

constructor( private cidadeService: CidadesService){

}

formSubmit(){
  console.log('nome', this.nomeCidade);

  let novaCidade = {
    id: this.id,
    nome: this.nomeCidade,
    pais: this.paisCidade,
    populacao: this.populacaoCidade
  }

  this.cidadeService.create(novaCidade);

}

}
