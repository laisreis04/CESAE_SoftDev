import { Injectable } from '@angular/core';
import { ICidade } from '../models/cidade.model';

@Injectable({
  providedIn: 'root'
})
export class CidadesService {

  // Funciona como um singlton, executa apenas uma vez

  cidades: Array<ICidade> = [

    {nome:'Porto', pais:'Portugal',populacao:78450},
    {nome:'Aveiro', pais:'Portugal',populacao:45450},
    {nome:'Barcelona', pais:'espanha',populacao:578450},
    {nome:'Porto', pais:'Portugal',populacao:450789},
    {nome:'Paris', pais:'França',populacao:58965547},
    {nome:'São Paulo', pais:'Brasil',populacao:11548798}

    ];


  constructor() {

   }

   create(novaCidade: ICidade){
    this.cidades.push(novaCidade);
   }
}
