<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Template</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
</head>

<body class="container mt-3">
    <header>
        <?php include '../layout/header.php' ?>
    </header>
    <main>
        <h3 class="mt-3">New Item</h3>
        <form action="save.php" method="post">
            <label for="item_name" class="form-label mt-3">Item Name</label>
            <input type="text" name="item_name" id="item_name" class="form-control" required>
            <label for="brand" class="form-label mt-3">Brand</label>
            <input type="text" name="brand" id="brand" class="form-control" required>
            <button class="btn btn-primary mt-3">Submit</button>
        </form>
    </main>
    <footer>
        <?php include '../layout/footer.php' ?>
    </footer>
</body>

</html>