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
        <input name="nome" value="{{ old('name') }}" type="texto" class="form-control" id="exampleFormControlInput1" required>
        @error('nome')
<div class="alert alert-danger">
Tarefa inválida
</div>
        @enderror
    </div>


          <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Descrição</label>

        <input name="descricao" value="{{ old('descricao') }}" type="text" class="form-control" id="exampleFormControlInput1" >
        @error('descricao')
        <div class="alert alert-danger">
        Descrição inválida
        </div>
                @enderror
    </div>

        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">User ID</label>
            <input name="user_id"  type="number" class="form-control" id="exampleFormControlInput1"  required>
            @error('user_id')
            <div class="alert alert-danger">
            User inválido
                <select name="user_id" id="">
                    @foreach($users as $user)
                    <option value="{{ $user -> id }}">
                        {{ $user->name }}
                    </option>

                    @endforeach

                </select>
        </div>
                    @enderror



{{--
        <div>
            <select class="form-select form-select-md mb-4" name="user_id">
                <option value="" selected>Seleccionar</option>
                @foreach ($users as $item)
                    <option @if ($item->id == request()->query('user_id')) selected @endif value="{{ $item->id }}">
                        {{ $item->name }}
                    </option>
                @endforeach
            </select>
        </div>
    </form> --}}

</div>



          <button type="submit" class="btn btn-primary">Enviar</button>
    </form>
    <br>
    <a class="btn btn-success" href="{{route('home.index')}}">Voltar</a>
    <br>
    <br>

    </div>

@endsection
