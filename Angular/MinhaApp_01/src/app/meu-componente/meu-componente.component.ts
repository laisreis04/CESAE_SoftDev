import { Component } from '@angular/core';

@Component({
  selector: 'amc',
  standalone: true,
  imports: [],
  templateUrl: './meu-componente.component.html',
  styleUrl: './meu-componente.component.scss'
})
export class MeuComponenteComponent {
// Colocar coisas do Javascript

meuNome = 'Mochi'
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


alterarImagem(): void{
  this.imagem = this.imagens[1];



}
alterarImagem2(): void {
  this.imagem = this.imagens[2];
}
}

