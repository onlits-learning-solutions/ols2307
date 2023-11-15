<?php
require '../env.php';
$name = $_POST['name'];
$con = mysqli_connect(SERVER, USERNAME, PASSWORD, DATABASE);
$sql = "INSERT INTO buyer (name) VALUES('$name')";
mysqli_query($con, $sql);
echo 'Buyer registered successfully!';