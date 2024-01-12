@extends('Layout.femaster')

@section('content2')
<div class="container">
    <h5>Nome da escola: </h5><p>{{ $cesaeInfo['name']}}</p>
    <h5>Endereço: </h5><p>{{ $cesaeInfo['address']}}</p>
    <h5>Contato: </h5><p>{{ $cesaeInfo['email']}}</p>
    </div>
@endsection



@section('content')
<div class="container">
<h3>Hello World, estamos na views</h3>
<h5>Tem disponivel os seguintes links:</h5>


<ul>
    <li><a href="{{route('bemvindos')}}">Vai para Home</a></li>
    <li><a href="{{route('youtube')}}">Quero ver social media</a></li>
    <li><a href="{{route('users.add_user')}}">Área do Utilizador</a></li>
    <li><a href="{{route('users.all_user')}}">Todxs User</a></li>
</ul>

</div>


@endsection


