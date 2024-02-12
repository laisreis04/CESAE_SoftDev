@extends('lauout.femaster')

@section('content')

<h1>Olá, {{ Auth::user()->name }} </h1>

{{-- Autenticação, aparece cquando o user é autenticado --}}

@auth
    @if(Auth::user()->user_type == 1)
    <!-- Alerta -->
    <div class="alert alert-info" role="alert">
        Conta de Administrador
    </div>
    @endif
@endauth


@endsection
