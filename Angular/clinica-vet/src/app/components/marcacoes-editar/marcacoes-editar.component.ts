import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { ActivatedRoute, Router, RouterLink, RouterLinkActive } from '@angular/router';
import { MarcacoesService } from '../../services/marcacoes.service';
import { Subscription } from 'rxjs/internal/Subscription';
import { HttpClientModule } from '@angular/common/http';


@Component({
  selector: 'app-marcacoes-editar',
  standalone: true,
  imports: [ReactiveFormsModule, RouterLink,RouterLinkActive, HttpClientModule],
  providers:[MarcacoesService],
  templateUrl: './marcacoes-editar.component.html',
  styleUrl: './marcacoes-editar.component.scss'
})
export class MarcacoesEditarComponent {

  marcacaoId: string = '';
  criarSubscription?: Subscription;
  submitted: boolean = false;

  formularioMarcacao: FormGroup = new FormGroup({
    tipo: new FormControl(''),
    animalId: new FormControl(''),
    tutorId: new FormControl(''),
    dataHora: new FormControl(''),
    realizada: new FormControl(''),
    cancelada: new FormControl(''),
  });

  constructor(private route: ActivatedRoute,
    private marcacoesService: MarcacoesService,
    private router: Router){}

handleUpdate(): void {

  this.submitted = true;

  this.criarSubscription = this.marcacoesService
  .update({
    tipo: this.formularioMarcacao.controls['tipo'].getRawValue(),
    animalId: this.formularioMarcacao.controls['animalId'].getRawValue(),
    tutorId: this.formularioMarcacao.controls['tutorId'].getRawValue(),
    dataHora: this.formularioMarcacao.controls['dataHora'].getRawValue(),
    realizada: this.formularioMarcacao.controls['realizada'].value,
    cancelada: this.formularioMarcacao.controls['cancelada']?.value,
  }).subscribe({
    next: () => {
      this.router.navigate(['/'])
    },
    error: (err) => {
      console.error('Erro ao editar a marcação', err)
    }
  })

      }


  ngOnInit() {
    this.marcacaoId = this.route.snapshot.paramMap.get('id') || '';
  }

}

