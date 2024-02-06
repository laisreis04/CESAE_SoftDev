<?php

namespace App\Http\Controllers;


use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use App\Http\Controllers\TasksController;


class TasksController extends Controller{

public function tasksView(){


    $tasks = $this->getTasks();

    // Para fazer o debug e achar o erro
    // dd($tasks);

    //colocar o nome da pasta onde esta a view e o compact é o que eu quero que mostre
    return view('Tasks.tasks', compact('tasks'));


}



private function getTasks(){

    $tasks = DB::table ('tasks')
    ->join('users', 'user_id','users.id')
    ->select('tasks.*', 'users.name as username' )
    ->get();

    return $tasks;
}

public function viewTask($id){

    $myTask = DB::table('tasks')
    ->where('id', ($id))
    ->first();

    return view('Tasks.tasks', compact ('myTask'));

}



public function createTask(Request $request){

    $request->validate([
        'nome' => 'required|unique:users',
        'descricao' => 'required|string|max:140'
    ]);

    Task::insert([
        'nome'=>$request->$nome,
        'descrcao' =>$request->$descricao,
        'status'=>$request->$status
    ]);

    return redirect()->route('tasks.tasks')->with('message', 'Tarefa adiconada com sucesso !');
}



}
