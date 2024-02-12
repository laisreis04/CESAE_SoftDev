<?php

namespace App\Http\Controllers;


use App\Models\Task;
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

public function addTask(){

    $users=DB::table('users')->get();

return view('Tasks.tasks');
}




public function getTasks(){

    $tasks = DB::table ('tasks')
    ->join('users', 'user_id','users.id')
    ->select('tasks.*', 'users.name as username' )
    ->get();

    return $tasks;
}

public function viewTask($id){

    $myTask = DB::table('tasks')
    ->where('id', ($id))
    ->leftJoin('users', 'users.name', '=', 'user_id')
    ->select('tasks*','user.name as usname' )
    ->first();

    $users =DB::table('users')->get();

    return view('tasks.viewTask', compact ('myTask','users'));

}

public function deleteTask($id){
    Db::table('tasks')
    ->where('id', ($id))
    ->delete();

    return back();

    }



public function createTask(Request $request){

    // dd($request->all());

    $request->validate([
        'nome' => 'required|string|max:10',
        'descricao' => 'string|max:140',
        'user_id'=>'required|integer|exists:users,id'
    ]);

    Task::insert([
        'nome'=>$request->nome,
        'descricao' =>$request->descricao,
        'user_id'=>$request->user_id,
        'status'=>1,
        'due_at'=>now()
    ]);

    return redirect()->route('tasks.tasks')->with('message', 'Tarefa adicionada com sucesso !');
}

public function updateTask(Request $request){

    Task::where('id', $request->id)->update([
        'nome'=>$request->nome,
        'descricao' =>$request->descricao,
        'user_id'=>$request->user_id
    ]);

    return redirect()->route('tasks.tasks')->with('message', 'Tarefa Atualizada');


}



}
