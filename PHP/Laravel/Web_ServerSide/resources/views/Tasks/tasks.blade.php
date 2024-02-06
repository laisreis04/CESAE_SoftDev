@extends('Layout.femaster')

@section('content')



<h1>Adicionar Tarefas</h1>


<ul>
    <table class="table">
        <thead>
          <tr>
            <th scope="col">ID:</th>
            <th scope="col">Nome</th>
            <th scope="col">Descrição</th>
            {{-- <th scope="col">Data</th>
            <th scope="col">Estado</th> --}}
            <th scope="col">Nome</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            @foreach ($tasks as $item)
            <th scope="row">{{$item->id}}</th>
            <td>{{$item->nome}}</td>
            <td>{{$item->descricao}}</td>
            {{-- <td>{{$item->due_at}}</td>
            <td>{{$item->status}}</td> --}}
            <td>{{$item->username}}</td>
            <td><a href="{{ route('tasks.tasks', $item->id) }}" class="btn btn-info">Ver</a></td>
            <td><a href="{{ route('tasks.tasks', $item->id) }}" class="btn btn-danger">Delete</a></td>
        </tr>



            @endforeach

        </tbody>
      </table>
</ul>


@endsection
