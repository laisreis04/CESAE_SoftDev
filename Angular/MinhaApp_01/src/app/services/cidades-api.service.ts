import { Injectable } from '@angular/core';
import { ICidade } from '../models/cidade.model';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CidadesService {

  cidades : Array<ICidade> = [];

  constructor(private http: HttpClient){
  }


create(novaCidade: ICidade): void{}


limparDados(): void{}

repordadis():void{}

readAll():Observable<any> {

  return this.http.get('http://localhost:3000/cidades')
}

read(id: number): Observable<any>{
  return this.http.get('http://localhost:3000/cidades/' + id)
}

udpate():void{}

delte():void{}


  }

