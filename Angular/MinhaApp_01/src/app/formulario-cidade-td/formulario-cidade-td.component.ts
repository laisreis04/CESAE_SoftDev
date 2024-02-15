import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CidadesService } from '../services/cidades-ls.service';
import { ActivatedRoute, Router } from '@angular/router';
import { ICidade } from '../models/cidade.model';
import { NgIf } from '@angular/common';

@Component({
  selector: 'app-formulario-cidade-td',
  standalone: true,
  imports: [FormsModule, NgIf],
  templateUrl: './formulario-cidade-td.component.html',
  styleUrl: './formulario-cidade-td.component.scss'
})


export class FormularioCidadeTdComponent {
minhaCidade: ICidade = {
  id: 0,
nome:  '',
pais:  '',
populacao: 0

}


constructor( private cidadeService: CidadesService,
  private router: Router,
  private route: ActivatedRoute){
}

ngOnInit(){

  this.minhaCidade.id = parseInt(this.route.snapshot.paramMap.get('id')??'0') ;

  if(this.minhaCidade.id > 0){
    let cidade: ICidade = this.cidadeService.read(this.minhaCidade.id);

    this.minhaCidade.nome = cidade.nome;
    this.minhaCidade.pais= cidade.pais;
    this.minhaCidade.populacao = cidade.populacao;
  }

  console.log('id', this.minhaCidade.id);

}

formSubmit(){
  console.log('nome', this.minhaCidade.nome);

  
  this.cidadeService.create(this.minhaCidade);
  this.router.navigate(['minha-lista'])

}

}
