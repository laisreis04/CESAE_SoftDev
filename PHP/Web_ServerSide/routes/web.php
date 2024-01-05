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
})->nome('home.index');


/*reencaminha para o view*/
Route::get('/home/{nome}', function ($nome) {
    return '<h1>Qual o seu nome? </h1>'.$nome;
});

Route::get('/home/{nome}', function () {
    return '<h1>Qual o seu nome? </h1>';
})->name('home.index');
