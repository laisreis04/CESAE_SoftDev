<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class BrandController extends Controller
{


public function brandView(){

return view ('Brands.brands', compact('brands'));

}

public function aboutView(){
    
    return view ('Content.about', compact('about'));
}


}
