<?php

namespace App\Http\Controllers;

use App\Models\User;
use Illuminate\Http\Request;

use function PHPUnit\Framework\isEmpty;

class UserController extends Controller
{
    public function authenticate(Request $request)
    {
        $user = User::where('email', $request->email)->where('password', $request->password)->first();

        if ($user == null) {
            return "Invalid email/password";
        } else {
            return redirect('/task');
        }
    }
}
