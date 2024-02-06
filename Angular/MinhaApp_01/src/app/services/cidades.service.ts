import { Injectable } from '@angular/core';
import { ICidade } from '../models/cidade.model';

@Injectable({
  providedIn: 'root'
})
export class CidadesService {

  // Funciona como um singlton, executa apenas uma vez

  cidades: Array<ICidade> = [



    ];


  constructor() {

    console.log('localStorege.getItem("cidades');

    if(!localStorage.getItem('cidades')){
      let cidades: Array<ICidade> = [

        // {nome:'Porto', pais:'Portugal',populacao:78450},
        // {nome:'Aveiro', pais:'Portugal',populacao:45450},
        // {nome:'Barcelona', pais:'espanha',populacao:578450},
        // {nome:'Porto', pais:'Portugal',populacao:450789},
        // {nome:'Paris', pais:'França',populacao:58965547},
        // {nome:'São Paulo', pais:'Brasil',populacao:11548798}
      ];
      localStorage.setItem('cidades',JSON.stringify(cidades));

      // let cidades: Array<ICidade> = JSON.parse(localStorage.getItem('cidades') || '');
      // this.cidades=cidades;
    }




   }

create(novaCidade: ICidade){
    this.cidades.push(novaCidade);
    localStorage.setItem('cidades', JSON.stringify(this.cidades));
   }


read(cidade: ICidade): void{


   }

readAll(): void{

  let cidades: Array<ICidade> = JSON.parse(localStorage.getItem('cidades') || '');
  this.cidades=cidades;
   }

update(cidade: ICidade): void{


}

delete(cidade: ICidade): void{

}

}
