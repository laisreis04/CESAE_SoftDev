import { Routes } from '@angular/router';
import { PrimeiraPaginaComponent } from './primeira-pagina/primeira-pagina.component';
import { SegundaPaginaComponent } from './segunda-pagina/segunda-pagina.component';
import { SegundaAaaPaginaComponent } from './segunda-aaa-pagina/segunda-aaa-pagina.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

export const routes: Routes = [

{path: 'primeira' , title:'Primeira Página', component: PrimeiraPaginaComponent},
{path: 'segunda', title:'Segunda Página',component: SegundaPaginaComponent,
children: [
  {path: 'aaa', title: 'Segunda Página AAA', component:SegundaAaaPaginaComponent}
]},
//Esse é o caminho para redirecionar uma página em branco/vazia
{
  path: '',redirectTo: '/primeira', pathMatch: 'full'
},
{
  path: '**', title:'404 - página não encontrada', component: PageNotFoundComponent
}

];
