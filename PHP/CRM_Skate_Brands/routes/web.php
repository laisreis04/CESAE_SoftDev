<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\BrandController;
use App\Http\Controllers\LoginController;

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
});

//Rota Brands/about

Route::get('/brands', [BrandController::class, 'brandView'])->name('brand.view');
Route::get('/about', [BrandController::class, 'aboutView'])->name('about.view');

//Rota Login

Route::get('/login', [LoginController::class, 'loginView'])->name('login.login');
