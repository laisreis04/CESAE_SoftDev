@extends('Layout.femaster')
@section('content')
<div class="container">
    <br>
    <h2>Adicionar Utilizadores</h2>
    <br>


    <form method="POST" action="{{ route('users.create') }}">
@csrf
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Nome</label>


        <input name="name" value="{{ old('name') }}" type="texto" class="form-control" id="exampleFormControlInput1" placeholder="Nome" required>
        @error('name')
        <div class="alert alert-danger">
            O nome que colocou é inválido.
        </div>
    @enderror
    </div>


          <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Email</label>
            <input name="email" value="{{ old('email') }}" type="email" class="form-control" id="exampleFormControlInput1" placeholder="email@exemplo.com" required>
            @error('email')
            <div class="alert alert-danger">
                O mail que colocou já está registado
            </div>
        @enderror
        </div>

          <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Password</label>
            <input name="password" type="password" class="form-control" id="exampleFormControlInput1" placeholder="Password" required>
          </div>
          <button type="submit" class="btn btn-primary">Enviar</button>
    </form>
    <br>
    <a class="btn btn-success" href="{{route('home.index')}}">Voltar</a>
    <br>
    <br>

    </div>

@endsection
