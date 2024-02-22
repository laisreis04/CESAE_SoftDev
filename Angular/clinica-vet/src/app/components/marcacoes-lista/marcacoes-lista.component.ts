import { Component } from '@angular/core';
import { Marcacao } from '../../models/marcacao';
import { Subscription } from 'rxjs';
import { MarcacoesService } from '../../services/marcacoes.service';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { RouterLink, RouterLinkActive } from '@angular/router';

@Component({
  selector: 'app-marcacoes-lista',
  standalone: true,
  imports: [ReactiveFormsModule, HttpClientModule, RouterLink, RouterLinkActive],
  providers:[MarcacoesService],
  templateUrl: './marcacoes-lista.component.html',
  styleUrl: './marcacoes-lista.component.scss'
})
export class MarcacoesListaComponent {

  marcacoes?: Marcacao[];

  marcacoesSubscription?: Subscription;

  constructor(private marcacoesService: MarcacoesService) {}

  ngOnInit() {
    this.marcacoesSubscription = this.marcacoesService.getAll().subscribe({
      next: (value) => {
        this.marcacoes = value;
      },
      error: (err) => {
        console.error('Erro ao carregar os dados!', err);
      },
    });
  }

  ngOnDestroy() {
    this.marcacoesSubscription?.unsubscribe();
  }

}
