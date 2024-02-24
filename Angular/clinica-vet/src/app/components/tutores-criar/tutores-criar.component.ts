import { HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { ReactiveFormsModule, FormGroup, FormControl, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Subscription } from 'rxjs';
import { TutoresService } from '../../services/tutores.service';

@Component({
  selector: 'app-tutores-criar',
  standalone: true,
  imports: [HttpClientModule, ReactiveFormsModule],
  providers: [TutoresService],
  templateUrl: './tutores-criar.component.html',
  styleUrl: './tutores-criar.component.scss'
})
export class TutoresCriarComponent {

  formularioTutores: FormGroup = new FormGroup({
    nome: new FormControl('', Validators.required),
    telemovel: new FormControl('', Validators.required),
    email: new FormControl('', Validators.required),
  });
  criarSubscription?: Subscription;
  submitted: boolean = false;

  constructor(
    private tutoresService: TutoresService,
    private router: Router
  ) {}

  handleSubmit(): void {
    this.submitted = true;

    if (this.formularioTutores.valid) {
      this.criarSubscription = this.tutoresService
        .create({
          nome: this.formularioTutores.controls['nome'].value,
          telemovel: this.formularioTutores.controls['telemovel'].value,
          email: this.formularioTutores.controls['email'].value,
        })
        .subscribe({
          next: (value) => {
            this.router.navigate(['/']);
          },
          error: (err) => {
            console.error('Erro ao criar uma nova marcação!', err);
          },
        });
    }
  }

  ngOnDestroy() {
    this.criarSubscription?.unsubscribe();
  }


}
