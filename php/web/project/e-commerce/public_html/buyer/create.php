<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Buyer Signup</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
</head>

<body>
    <header><?php require '../layout/header.php' ?></header>
    <nav><?php require '../layout/navbar.php' ?></nav>
    <main>
        <form action="save.php" method="post">
            <label for="name" class="form-label">Name</label>
            <input type="text" name="name" id="name" class="form-control" required>
            <button class="btn btn-primary" name="submit">Submit</button>
            <button type="reset" class="btn btn-warning">Reset</button>
        </form>
    </main>
    <footer><?php require '../layout/footer.php' ?></footer>
</body>

</html>