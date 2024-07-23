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
    <h3 class="alert alert-light">New Task</h3>
    <form action="/tasks" method="post">
        @csrf
        <label for="name" class="form-label">Name</label>
        <input type="text" name="name" id="name" class="form-control">
        <label for="due_date" class="form-label mt-3">Due Date</label>
        <input type="date" name="due_date" id="due_date" class="form-control">
        <button class="btn btn-primary mt-3">Submit</button>
    </form>
</body>

</html>