import { Component } from '@angular/core';
import { Title } from '@angular/platform-browser';
import { Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { MarcacoesCriarComponent } from './components/marcacoes-criar/marcacoes-criar.component';
import { MarcacoesEditarComponent } from './components/marcacoes-editar/marcacoes-editar.component';
import { MarcacoesListaComponent } from './components/marcacoes-lista/marcacoes-lista.component';

export const routes: Routes = [

  {path: 'home', title: 'Página Inicial', component: HomeComponent,},
  {path: 'marcacao', title: 'Marcações', component: MarcacoesListaComponent},
  { path: 'nova-marcacao', title: 'Nova marcação', component: MarcacoesCriarComponent },
  { path: 'editar-marcacao/:id', title: 'Editar Marcação', component: MarcacoesEditarComponent, },





];
