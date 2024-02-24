import { Component } from '@angular/core';
import { CidadesService } from '../services/cidades-api.service';
import { HttpClientModule } from '@angular/common/http';
import { ActivatedRoute } from '@angular/router';
import { FormBuilder, FormGroup, FormGroupDirective, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-form-api',
  standalone: true,
  imports: [HttpClientModule, ReactiveFormsModule],
  providers:[CidadesService],
  templateUrl: './form-api.component.html',
  styleUrl: './form-api.component.scss'
})
export class FormApiComponent {

  form: FormGroup;

  minhaCidade = {
    id: 0,
  nome:  '',
  pais:  '',
  populacao: 0

  }

  constructor(private cidadesService: CidadesService,
    private route: ActivatedRoute,
    private formBuilder: FormBuilder){

      this.form = formBuilder.group({
        nome: ['', Validators.required],
        pais:['', Validators.required],
        populacao: [0, Validators.min(1000), Validators.max(10000)]
      })

  }

  ngOnInit(){

 this.minhaCidade.id = parseInt(this.route.snapshot.paramMap.get('id')??'0');
 console.log('id', this.minhaCidade.id);

if (this.minhaCidade.id > 0){
  this.cidadesService.read(this.minhaCidade.id).subscribe((cidade)=>{
    console.log(cidade);

  })
}

 }

 formSubmit(){


 }

  }

