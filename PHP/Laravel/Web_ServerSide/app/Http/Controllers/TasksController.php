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

}
