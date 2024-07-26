<?php

namespace App\Http\Controllers;

use App\Models\Task;
use Illuminate\Http\Request;

class TaskController extends Controller
{
    public function index()
    {
        return view('home', ['tasks' => Task::all()]);
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

    public function show($id)
    {
        return view('task-details', ['task' => Task::find($id)]);
    }

    public function edit($id)
    {
        return view('edit-task', ['task' => Task::find($id)]);
    }

    public function update(Request $request, $id)
    {
        $task = Task::find($id);
        $task->name = $request->name;
        $task->due_date = $request->due_date;
        $task->priority = 'Normal';
        $task->status = 'Open';
        $task->save();
        return redirect('/tasks');
    }

    public function delete($id)
    {
        $task = Task::find($id);
        $task->delete();
        return redirect('/tasks');
    }
}
