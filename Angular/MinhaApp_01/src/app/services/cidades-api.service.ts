import { Injectable } from '@angular/core';
import { ICidade } from '../models/cidade.model';

@Injectable({
  providedIn: 'root'
})
export class CidadesService {

  cidades : Array<ICidade> = [];

  constructor(){
  }


create(novaCidade: ICidade): void{}


limparDados(): void{}

repordadis():void{}

readAll():void{}

read(id: number){}

udpate():void{}

delte():void{}


  }

