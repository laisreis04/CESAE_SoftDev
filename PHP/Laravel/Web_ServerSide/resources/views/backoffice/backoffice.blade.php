@extends('layout.femaster')

@section('content')

<h1>Olá, {{ Auth::user()->name }} você está no BackOffice</h1>

{{-- Autenticação, aparece quando o user é autenticado --}}

@auth
    @if(Auth::user()->user_type == 1)
    <!-- Alerta -->
    <div class="alert alert-info" role="alert">
        Conta de Administrador
    </div>
    @endif
@endauth


@endsection
