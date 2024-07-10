<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class UserController extends Controller
{
    function authenticate()
    {
        return view('home');
    }
}
