@extends('Layout.femaster')

@section('content')

<h1>Olá {{ $myUser->name }}, Editar Tarefa</h1>



<form method="POST" action="{{ route('tasks.update') }}">
@csrf
<input type="hidden" name="id" value="{{ $myTask->id }}">

        {{-- Nome --}}
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Nome</label>

        <input name="name" value="{{ $myTask->nome }}" type="texto" class="form-control" id="exampleFormControlInput1" placeholder="Nome" required>

    </div>

        {{-- Descrição --}}
          <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Descrição</label>
            <input  name="descricao" value="{{ $myTask->descricao }}" type="email" class="form-control" id="exampleFormControlInput1" placeholder="Escreva aqui a descrição da mensagem " required>


            {{-- Status --}}
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label">Status</label>
                <input name="status" value="{{ $myTask->descricao }}" type="texto" class="form-control" id="exampleFormControlInput1" >

        </div>

          <button type="submit" class="btn btn-info">Update</button>
    </form>



@endsection
