import { Component } from '@angular/core';
import { Title } from '@angular/platform-browser';
import { Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { MarcacoesCriarComponent } from './components/marcacoes-criar/marcacoes-criar.component';
import { MarcacoesEditarComponent } from './components/marcacoes-editar/marcacoes-editar.component';
import { MarcacoesListaComponent } from './components/marcacoes-lista/marcacoes-lista.component';
import { MarcacoesEliminarComponent } from './components/marcacoes-eliminar/marcacoes-eliminar.component';
import { AnimaisCriarComponent } from './components/animais-criar/animais-criar.component';
import { AnimaisEditarComponent } from './components/animais-editar/animais-editar.component';
import { AnimaisEliminarComponent } from './components/animais-eliminar/animais-eliminar.component';
import { AnimaisListaComponent } from './components/animais-lista/animais-lista.component';
import { TutoresCriarComponent } from './components/tutores-criar/tutores-criar.component';
import { TutoresEditarComponent } from './components/tutores-editar/tutores-editar.component';
import { TutoresEliminarComponent } from './components/tutores-eliminar/tutores-eliminar.component';
import { TutoresListaComponent } from './components/tutores-lista/tutores-lista.component';

export const routes: Routes = [

  {path: 'home', title: 'Página Inicial', component: HomeComponent,},
  {path: 'marcacao', title: 'Marcações', component: MarcacoesListaComponent},
  { path: 'nova-marcacao', title: 'Nova marcação', component: MarcacoesCriarComponent },
  { path: 'editar-marcacao/:id', title: 'Editar Marcação', component: MarcacoesEditarComponent, },
  { path: 'eliminar-marcacao/:id',title: 'Eliminar Marcação',component: MarcacoesEliminarComponent,},
  {path: 'animais', title: 'Animal', component: AnimaisListaComponent},
    { path: 'novo-animal',title: 'Novo Animal',component: AnimaisCriarComponent,},
    { path: 'editar-animal/:id',title: 'Editar Animal',component: AnimaisEditarComponent,},
    { path: 'eliminar-animal/:id',title: 'Eliminar Animal',component: AnimaisEliminarComponent,},
    {path: 'tutores', title: 'Tutores', component: TutoresListaComponent},
    { path: 'novo-tutor',title: 'Novo Tutor',component: TutoresCriarComponent,},
    { path: 'editar-tutor/:id',title: 'Editar Tutor',component: TutoresEditarComponent,},
    { path: 'eliminar-tutor/:id',title: 'Eliminar Tutor',component: TutoresEliminarComponent,},




];
