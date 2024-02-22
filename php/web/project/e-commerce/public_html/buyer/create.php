<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Buyer Signup</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
</head>

<body class="mt-3 m-5">
    <header><?php require '../layout/header.php' ?></header>
    <nav><?php require '../layout/navbar.php' ?></nav>
    <main class="container">
        <form action="save.php" method="post">
            <label for="name" class="form-label">Name</label>
            <input type="text" name="name" id="name" class="form-control" required>
            <label for="email" class="form-label mt-3">Email</label>
            <input type="email" name="email" id="email" class="form-control">
            <label for="password" class="form-label mt-3">Password</label>
            <input type="password" name="password" id="password" class="form-control">
            <button class="btn btn-primary mt-3" name="submit">Submit</button>
            <button type="reset" class="btn btn-warning mt-3">Reset</button>
        </form>
    </main>
    <footer><?php require '../layout/footer.php' ?></footer>
</body>

</html>