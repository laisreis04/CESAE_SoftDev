import { Routes } from '@angular/router';
import { PrimeiraPaginaComponent } from './primeira-pagina/primeira-pagina.component';
import { SegundaPaginaComponent } from './segunda-pagina/segunda-pagina.component';
import { SegundaAaaPaginaComponent } from './segunda-aaa-pagina/segunda-aaa-pagina.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { SegundaBbbPaginaComponent } from './segunda-bbb-pagina/segunda-bbb-pagina.component';
import { MinhaListaComponent } from './minha-lista/minha-lista.component';
import { MinhaListaItemComponent } from './minha-lista-item/minha-lista-item.component';
import { ListaAnimaisComponent } from './lista-animais/lista-animais.component';
import { FormularioCidadeTdComponent } from './formulario-cidade-td/formulario-cidade-td.component';
import { FormApiComponent } from './form-api/form-api.component';


export const routes: Routes = [

{path: 'primeira' , title:'Primeira Página', component: PrimeiraPaginaComponent},
{path: 'segunda', title:'Segunda Página',component: SegundaPaginaComponent,
children: [
  {path: 'aaa', title: 'Segunda Página AAA', component:SegundaAaaPaginaComponent},
  { path: 'bbb', title:'Segunda Página BBB', component:SegundaBbbPaginaComponent}
]},
{
  path: 'minha-lista',
  title:'Minha Lista',
  component:MinhaListaComponent
},
{
  path:'minha-lista-item',
  title:'Itens',
  component:MinhaListaItemComponent
},
{
  path: 'lista-animais',
  title:'Animais',
  component:ListaAnimaisComponent
},
// {
//   path: 'formulario-cidade-td',
//   title:'Criar - Formulario Cidade (Template-driven forms)',
//   component:FormularioCidadeTdComponent
// },
// {
//   path: 'formulario-cidade-td/:id',
//   title:'Editar - Formulario Cidade (Template-driven forms)',
//   component:FormularioCidadeTdComponent
// },

{
  path:'formulario-cidade-td',
  children: [
{
  path:':id',
  title:'Editar - Formulario Cidade (Template-driven forms)',
  component:FormularioCidadeTdComponent
},
{
  path: '',
  title:'Criar - Formulario Cidade (Template-driven forms)',
  component:FormularioCidadeTdComponent
}

  ]
},

{
  path:'form-api',
  children: [
{
  path:':id',
  title:'Editar - Formulario Cidade (reactive forms)',
  component:FormApiComponent
},
{
  path: '',
  title:'Criar - Formulario Cidade (reactive forms)',
  component:FormApiComponent
}

  ]
},


//Esse é o caminho para redirecionar uma página em branco/vazia
{
  path: '',redirectTo: '/primeira', pathMatch: 'full'
},
{
  path: '**', title:'404 - página não encontrada', component: PageNotFoundComponent
}


];
