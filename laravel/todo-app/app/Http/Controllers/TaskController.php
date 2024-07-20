<?php

namespace App\Http\Controllers;

use App\Models\Task;
use Illuminate\Http\Request;

class TaskController extends Controller
{
    public function index()
    {
        $tasks = Task::all();
        return view('home', $tasks);
    }

    public function create()
    {
        return view('new-task');
    }

    public function store(Request $request)
    {

    }
}