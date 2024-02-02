<?php


use Illuminate\Support\Facades\Route;
use App\Http\Controllers\UserController;

use App\Http\Controllers\IndexController;
use App\Http\Controllers\TasksController;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "web" middleware group. Make something great!
|
*/


Route::get('/', function () {
    return view('welcome');
})->name('bemvindos');

Route::get('/ola', function () {
    return '<h1>Hello Turma de Software</h1>';
});

Route::get('/hello/{nome}', function ($nome) {
    return '<h1>Olaaaaa</h1>'.$nome;
});


Route::get('/home', [IndexController::class, 'index'])->name('home.index');


Route::get('/home/social' ,function(){
return view('main.social');
})->name('youtube');


//Rotas User
Route::get('/users/add' , [UserController::class, 'userView'])->name('users.add_user');
Route::post('/users/create', [UserController::class, 'createUser'])->name('users.create');
Route::post('/users/upsate', [UserController::class, 'updateUser'])->name('users.update');

Route::get('/users/all' ,[UserController::class, 'allUsers'])->name('users.all_user');

//'/users/view{id}' dentro das chaves vai mostrar na barra de pesquisa o id da pessoa
Route::get('/users/view{id}' ,[UserController::class, 'viewUser'])->name('users.view');
Route::get('/users/delete{id}' ,[UserController::class, 'deleteUser'])->name('users.delete');

Route::fallback( function () {
    return view('Layout.fallback');
})->name('404page');


//Rota para tasks

Route::get('/tasks',[TasksController::class, 'tasksView'])->name('tasks.tasks');
Route::post('/tasks',[TasksController::class, 'tasksView'])->name('tasks.tasks');
