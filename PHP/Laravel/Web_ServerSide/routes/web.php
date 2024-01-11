<?php

use Illuminate\Support\Facades\Route;

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
Route::get('/home', function () {
    return view('main.home');
})->name('home.index');


Route::get('/home/social' ,function(){
return view('main.social');
})->name('youtube');


//Rotas User
Route::get('/users/add' ,function(){
    return view('users.add_user');
    })->name('users.add_user');


Route::fallback( function () {
    return '<h1>Ups, esta página não existe</h1>';
});
