@extends('Layout.femaster')

@section('content')

<h1>Olá {{ $myUser->name }}, Editar Perfil</h1>

{{-- <h2>Seus dados:</h2>
<hr>
<h4>Nome: {{ $myUser->name }}</h4>
<h4>Phone: {{ $myUser->phone }}</h4>
<h4>Address: {{ $myUser->address }}</h4>
<h4>Email: {{ $myUser->email }}</h4>
<h4>Pasword: {{ $myUser->password }}</h4>
<hr>
<h2>Update</h2> --}}

<form method="POST" action="{{ route('users.update') }}">
@csrf
<input type="hidden" name="id" value="{{ $myUser->id }}">

        {{-- Nome --}}
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Nome</label>

        <input name="name" value="{{ $myUser->name }}" type="texto" class="form-control" id="exampleFormControlInput1" placeholder="Nome" required>
        @error('name')
        <div class="alert alert-danger">
            O nome que colocou é inválido.
        </div>
    @enderror
    </div>

        {{-- Email --}}
          <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Email</label>
            <input  name="email" value="{{ $myUser->email }}" type="email" class="form-control" id="exampleFormControlInput1" placeholder="email@exemplo.com" required>
            {{-- @error('email')
            <div class="alert alert-danger">
                O mail que colocou já está registado
            </div>
            @enderror --}}

            {{-- Morada --}}
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label">Morada</label>
                <input name="address" value="{{ $myUser->address }}" type="texto" class="form-control" id="exampleFormControlInput1" >
                @error('adress')
                <div class="alert alert-danger">
                    Morada Inválida
                </div>
@enderror

                {{-- Telefone --}}
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">Telefone</label>
                    <input name="phone" value="{{ $myUser->phone }}" type="texto" class="form-control" id="exampleFormControlInput1" >
                    @error('adress')
                    <div class="alert alert-danger">
                        Formato inválido
                    </div>

        @enderror
        </div>

          {{-- <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Password</label>
            <input name="password" type="password" class="form-control" id="exampleFormControlInput1" placeholder="Password" required>
          </div> --}}
          <button type="submit" class="btn btn-info">Update</button>
    </form>



@endsection
