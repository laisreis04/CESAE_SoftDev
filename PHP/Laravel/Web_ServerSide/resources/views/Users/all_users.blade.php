@extends('Layout.femaster')

@section('content')

<div class= container>
<h1>Olá todos users!!</h1>

{{-- <p>{{ $hello}}</p>
<p>{{ $helloAgain}}</p>

<p>{{ $daysOfWeek[2]}}</p>

<p>{{ $courseInfo['name']}}</p>

<p>{{ $courseInfo['modules'][0]}}</p> --}}




</div>

@endsection

@section('content2')

@if(session('message'))
<div class="alert alert-success">
{{ (session('message')) }}
</div>
@endif
<ul>
    <table class="table">
        <thead>
          <tr>
            <th scope="col">ID:</th>
            <th scope="col">Nome</th>
            <th scope="col">Phone</th>
            <th scope="col">Email</th>
            <th></th>
          </tr>
        </thead>
        <tbody>
          <tr>
            @foreach ($userInfo as $user)
            <th scope="row">{{$user->id}}</th>
            <td>{{$user->name}}</td>
            <td>{{$user->phone}}</td>
            <td>{{$user->email}}</td>
            <td><a href="{{ route('users.view', $user->id) }}" class="btn btn-info">Ver</a></td>
            <td><a href="{{ route('users.delete', $user->id) }}" class="btn btn-danger">Delete</a></td>
          </tr>



            @endforeach

        </tbody>
      </table>



</ul>


@endsection
