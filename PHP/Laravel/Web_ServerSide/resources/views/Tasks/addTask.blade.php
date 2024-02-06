@extends('Layout.femaster')
@section('content')
<div class="container">
    <br>
    <h2>Adicionar Tarefas</h2>
    <br>


    <form method="POST" action="{{ route('tasks.create') }}">
@csrf
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Nome da tarefa</label>
        <input name="name" value="{{ old('name') }}" type="texto" class="form-control" id="exampleFormControlInput1" required>

    </div>


          <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Descrição</label>
            <input name="descricao" value="{{ old('descricao') }}" type="text" class="form-control" id="exampleFormControlInput1"  required>
        </div>

          <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Estado</label>
            <input name="status" type="text" class="form-control" id="exampleFormControlInput1"  required>
          </div>
          <button type="submit" class="btn btn-primary">Enviar</button>
    </form>
    <br>
    <a class="btn btn-success" href="{{route('home.index')}}">Voltar</a>
    <br>
    <br>

    </div>

@endsection
