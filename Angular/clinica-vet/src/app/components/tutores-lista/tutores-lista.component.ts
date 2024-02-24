import { HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';
import { Subscription } from 'rxjs';
import { Tutores } from '../../models/tutores';
import { TutoresService } from '../../services/tutores.service';

@Component({
  selector: 'app-tutores-lista',
  standalone: true,
  imports: [HttpClientModule,RouterLink],
  providers: [TutoresService],
  templateUrl: './tutores-lista.component.html',
  styleUrl: './tutores-lista.component.scss'
})
export class TutoresListaComponent {

  tutores?: Tutores[];
  tutoresSubscription?: Subscription;

  constructor(private tutoresService:TutoresService){}

  ngOnInit() {
    this.tutoresSubscription = this.tutoresService.getAll().subscribe({
      next: (value) => {
        this.tutores = value;
      },
      error: (err) => {
        console.error('Erro ao carregar os dados!', err);
      },
    });
  }

  ngOnDestroy() {
    this.tutoresSubscription?.unsubscribe();
  }

}
