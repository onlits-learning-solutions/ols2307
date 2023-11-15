<?php
include '../env.php';
$con = mysqli_connect(SERVER, USERNAME, PASSWORD, DATABASE);
$item_name = $_POST['name'];
$brand = $_POST['brand'];
$sql = "INSERT INTO item(name, brand) VALUES()";
$con->close();