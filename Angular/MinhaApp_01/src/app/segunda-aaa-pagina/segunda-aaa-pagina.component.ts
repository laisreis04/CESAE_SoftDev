import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-segunda-aaa-pagina',
  standalone: true,
  imports: [ CommonModule],
  templateUrl: './segunda-aaa-pagina.component.html',
  styleUrl: './segunda-aaa-pagina.component.scss'
})
export class SegundaAaaPaginaComponent {


  valor: number= -1;

  fn(): void{
    if(this.valor > 0){

    }else if (this.valor == 0){

  }else{

  }

  switch (this.valor){
    case 0:
      //valor é igual a zero
      break;

  }

  }
}
