import { Routes } from '@angular/router';
import { PrimeiraPaginaComponent } from './primeira-pagina/primeira-pagina.component';
import { SegundaPaginaComponent } from './segunda-pagina/segunda-pagina.component';
import { SegundaAaaPaginaComponent } from './segunda-aaa-pagina/segunda-aaa-pagina.component';

export const routes: Routes = [

{path: 'primeira' , title:'primeira', component: PrimeiraPaginaComponent},
{path: 'segunda', title:'segunda',component: SegundaPaginaComponent,
children: [
  {path: 'aaa', title: 'aaa', component:SegundaAaaPaginaComponent}
]}

];
