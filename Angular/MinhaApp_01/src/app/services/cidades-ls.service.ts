import { Injectable, ɵisBoundToModule } from '@angular/core';
import { ICidade } from '../models/cidade.model';

@Injectable({
  providedIn: 'root'
})
export class CidadesService {

  // Funciona como um singlton, executa apenas uma vez

  cidades: Array<ICidade> = [];


  constructor() {

    console.log('localStorege.getItem("cidades');

    if(!localStorage.getItem('cidades')){
    this.reporDados();

      // let cidades: Array<ICidade> = JSON.parse(localStorage.getItem('cidades') || '');
      // this.cidades=cidades;
    }else{
      this.readAll();
    }


   }

create(novaCidade: ICidade){



// let maxID: number = 0;

// this.cidades.forEach(item)

//   (maxID,item) =>{
// maxID => item.id  ///////Continuar aqui
//   }
// );


const max: ICidade = this.cidades.reduce(
  (max,item) =>max.id > item.id ? max : item
);

novaCidade.id = max.id + 1;

    this.cidades.push(novaCidade);
    localStorage.setItem('cidades', JSON.stringify(this.cidades));



    console.log(this.cidades);
   }


read(id: number): ICidade{

return this.cidades.filter(x=> x.id === id)[0];
   }

   limpardados(): void{
localStorage.removeItem('cidades');
this.cidades = []; 
this.reporDados();


  }

  reporDados(): void{
    let cidades: Array<ICidade> = [

      {id: 1,nome:'Aveiro', pais:'Portugal',populacao:45450},
      {id: 2,nome:'Barcelona', pais:'espanha',populacao:578450},
      {id: 3,nome:'Porto', pais:'Portugal',populacao:450789},
      {id: 4,nome:'Paris', pais:'França',populacao:58965547},
      {id: 5,nome:'São Paulo', pais:'Brasil',populacao:11548798}
    ];

    this.cidades = cidades;
    localStorage.setItem('cidades', JSON.stringify(cidades));

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
