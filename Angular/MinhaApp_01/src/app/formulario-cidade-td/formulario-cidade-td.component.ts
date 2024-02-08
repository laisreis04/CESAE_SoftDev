import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CidadesService } from '../services/cidades-ls.service';
import { ActivatedRoute, Router } from '@angular/router';
import { ICidade } from '../models/cidade.model';

@Component({
  selector: 'app-formulario-cidade-td',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './formulario-cidade-td.component.html',
  styleUrl: './formulario-cidade-td.component.scss'
})
export class FormularioCidadeTdComponent {

idCidade: number = 0;
nomeCidade: string= '';
paisCidade: string= '';
populacaoCidade: number= 0;

constructor( private cidadeService: CidadesService,
  private router: Router,
  private route: ActivatedRoute){


}

ngOnInit(){

  this.idCidade = parseInt(this.route.snapshot.paramMap.get('id')??'0') ;

  if(this.idCidade > 0){
    let cidade: ICidade = this.cidadeService.read(this.idCidade);

    this.nomeCidade = cidade.nome;
    this.paisCidade = cidade.pais;
    this.populacaoCidade = cidade.populacao;
  }

  console.log('id', this.idCidade);

}

formSubmit(){
  console.log('nome', this.nomeCidade);

  let novaCidade: ICidade = {
    id: this.idCidade,
    nome: this.nomeCidade,
    pais: this.paisCidade,
    populacao: this.populacaoCidade
  }

  



  this.cidadeService.create(novaCidade);
  this.router.navigate(['minha-lista'])

}

}
