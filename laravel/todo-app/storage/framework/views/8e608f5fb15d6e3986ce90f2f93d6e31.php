<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>

<body class="container mt-5">
    <h1><?php echo e(env('APP_NAME')); ?></h1>
    <a href="/tasks/create">Create a new task</a>
    <h3 class="alert alert-light">Task List</h3>
    <table class="table">
        <tr>
            <th>Name</th>
            <th>Due Date</th>
            <th>Priority</th>
            <th>Status</th>
            <th></th>
        </tr>
        <?php $__currentLoopData = $tasks; $__env->addLoop($__currentLoopData); foreach($__currentLoopData as $task): $__env->incrementLoopIndices(); $loop = $__env->getLastLoop(); ?>
        <tr>
            <td><?php echo e($task->name); ?></td>
            <td><?php echo e($task->due_date); ?></td>
            <td><?php echo e($task->priority); ?></td>
            <td><?php echo e($task->status); ?></td>
            <td>
                <a href="/tasks/<?php echo e($task->id); ?>">Details</a>
                <a href="/tasks/edit/<?php echo e($task->id); ?>">Edit</a>
                <a href="/tasks/delete/<?php echo e($task->id); ?>">Delete</a>
            </td>
        </tr>
        <?php endforeach; $__env->popLoop(); $loop = $__env->getLastLoop(); ?>
    </table>
</body>

</html><?php /**PATH /home/manish/batches/ols2307/laravel/todo-app/resources/views/home.blade.php ENDPATH**/ ?>