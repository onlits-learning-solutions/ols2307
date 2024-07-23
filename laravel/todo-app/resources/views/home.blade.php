<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>

<body class="container mt-5">
    <h1>{{ env('APP_NAME') }}</h1>
    <a href="/tasks/create">Create a new task</a>
    <h3 class="alert alert-light">Task List</h3>
    <table width="100%">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Due Date</th>
            <th>Priority</th>
            <th>Status</th>
            <th></th>
        </tr>
        @foreach ($tasks as $task)
        <tr>
            <td>{{ $task->id }} </td>
            <td>{{ $task->name }}</td>
            <td>{{ $task->due_date }}</td>
            <td>{{ $task->priority }}</td>
            <td>{{ $task->status }}</td>
            <td><a href="">Edit</a> <a href="">Delete</a></td>
        </tr>
        @endforeach
    </table>
</body>

</html>