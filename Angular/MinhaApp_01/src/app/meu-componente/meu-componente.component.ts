import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'amc',
  standalone: true,
  imports: [],
  templateUrl: './meu-componente.component.html',
  styleUrl: './meu-componente.component.scss'
})
export class MeuComponenteComponent {
// Colocar coisas do Javascript

// É possivel usar de outras formas
// @Input({alias:'meu-nome'}) meuNome: string = 'Mochi';

@Input(
   'meu-nome'
) meuNome: string = 'Mochi';

@Output() mudancaContador = new EventEmitter<number>();
contador: number = 0;


mensagem ='fui sequestrado na rua '
imagem = 'https://images.pexels.com/photos/416160/pexels-photo-416160.jpeg?w=500'

imagens: string[] = [
  'https://images.pexels.com/photos/416160/pexels-photo-416160.jpeg?w=500',
  'https://t1.ea.ltmcdn.com/pt/posts/4/8/5/gato_fraco_o_que_fazer_24584_orig.jpg',
  'https://sadanduseless.b-cdn.net/wp-content/uploads/2021/02/cat-taxidermy14.jpg'
]


// Outra forma de fazer um Array
// arr: Array<string> = [
//   'https://images.pexels.com/photos/416160/pexels-photo-416160.jpeg?w=500',
//   'https://t1.ea.ltmcdn.com/pt/posts/4/8/5/gato_fraco_o_que_fazer_24584_orig.jpg',
//   'https://sadanduseless.b-cdn.net/wp-content/uploads/2021/02/cat-taxidermy14.jpg'
// ]




pCorTexto: string = '#EC008C';
pCorFundo: string = '#262473';
pAlterarCores: boolean = true;

alterarImagem(): void{
  this.imagem = this.imagens[1];



}
alterarImagem2(): void {
  this.imagem = this.imagens[2];
}

alterarCores(): void {
  let cor: string = this.pCorTexto;
  this.pCorTexto = this.pCorFundo;
  this.pCorFundo = cor;
}

alterarAtivo(): void{
this.pAlterarCores = false;
}

incrementar(): void{
this.contador++;
this.mudancaContador.emit(this.contador);

}

}

