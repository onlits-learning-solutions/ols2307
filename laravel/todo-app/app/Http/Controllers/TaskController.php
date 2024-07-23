<?php

namespace App\Http\Controllers;

use App\Models\Task;
use Illuminate\Http\Request;

class TaskController extends Controller
{
    public function index()
    {
        $tasks = Task::all();
        return view('home', ['tasks' => $tasks]);
    }

    public function create()
    {
        return view('new-task');
    }

    public function store(Request $request)
    {
        $task = new Task();
        $task->name = $request->name;
        $task->due_date = $request->due_date;
        $task->priority = 'Normal';
        $task->status = 'Open';
        $task->save();
        return redirect('/tasks');
    }
}
