<?php


namespace App\Http\Controllers;


use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;


class UserController extends Controller{

    public function userView(){

DB::table('users')
->updateOrInsert([
  'name'=> 'Pandora',
  'email' => 'pancora.punk@medacomida.com',
  'password'=> 'oihumana'

]);


$user = Db::table('users')
->get();

$myUser = DB::table('users')
->where('password', '12345')
->first();

// dd($myUser);



        return view('users.add_user');
    }

public function allUsers(){

    $hello = 'Finalmente vamos para código';
    $helloAgain = 'Achou';


    //variavel acessória
    $daysOfWeek = $this ->getWeekDays();

    // //Função acessória
    $courseInfo = $this ->courseInfo();


    $userInfo = $this -> getContacts();

    $user = $this -> getContacts();





    return view('users.all_users', compact(
        'hello',
        'helloAgain',
        'daysOfWeek',
        'courseInfo',
        'userInfo'
    ));
}

private function getWeekDays(){

    $daysOfWeek = ['Segunda', 'Terça', 'Quarta', 'Quinta', 'Sexta'];

    return $daysOfWeek;

}

private function courseInfo(){

$courseInfo = [
    'name' => 'Software Developer',
    'year' => 2024,
    'modules' => ['PHP','WebServices', 'Java'],
    ['Teste', 4,'Lais','João']
];

 return $courseInfo;
}


private function getContacts(){

    // $userInfo = [
    //     ['id'=> 1,'nome'=>'Lais','phone'=> '789456123','email'=> 'lalal@lalla.com'],
    //     ['id'=> 2,'nome'=>'Johnny','phone' =>'789456123','email'=> 'lalal@lalla.com'],
    //     ['id'=> 3,'nome'=>'Pandora','phone' =>'789456123','email'=> 'lalal@lalla.com'],
    //     ['id'=> 4,'nome'=>'Ghost','phone' =>'789456123','email'=> 'lalal@lalla.com'],
    // ];

    // $userInfo = DB::table('users')
    // ->get();


    $userInfo = DB::table('users')
->whereNull('updated_at')
    ->get();

    // $userInfo = User::get();

    // $adminType = User::TYPE_ADMIN;

    return $userInfo;

}

public function viewUser($id){

    $myUser= DB::table ('users')
    ->where('id', $id)
    ->first();

    // dd($id);
    return view('users.view', compact ('myUser'));
}




}

