<?php


namespace App\Http\Controllers;


use Illuminate\Http\Request;


class UserController extends Controller{

    public function userView(){
        return view('users.add_user');
    }

public function allUsers(){

    $hello = 'Finalmente vamos para código';
    $helloAgain = 'Achou';


    //variavel acessória
    $daysOfWeek = $this ->getWeekDays();

    // //Função acessória
    $courseInfo = $this ->courseInfo();


    $userInfo = $this -> userInfo();



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


protected function userInfo(){

    $userInfo = [
        ['id'=> 1,'nome'=>'Lais','phone'=> '789456123','email'=> 'lalal@lalla.com'],
        ['id'=> 2,'nome'=>'Johnny','phone' =>'789456123','email'=> 'lalal@lalla.com'],
        ['id'=> 3,'nome'=>'Pandora','phone' =>'789456123','email'=> 'lalal@lalla.com'],
        ['id'=> 4,'nome'=>'Ghost','phone' =>'789456123','email'=> 'lalal@lalla.com'],
    ];

    return $userInfo;

}






}
