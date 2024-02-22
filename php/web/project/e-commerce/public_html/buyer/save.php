<?php
require '../env.php';
$name = $_POST['name'];
$email = $_POST['email'];
$password = $_POST['password'];
$con = mysqli_connect(SERVER, USERNAME, PASSWORD, DATABASE);
$sql = "INSERT INTO buyer (name, email, password) VALUES('$name','$email',SHA('$password'))";
mysqli_query($con, $sql);
header("location:index.php");