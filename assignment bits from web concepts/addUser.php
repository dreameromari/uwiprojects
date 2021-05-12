<?php
include_once 'db_functions.php';

if (isset($_POST["email"]) &&  isset($_POST["password"]) /* && isset($_POST["country"])*/)
{
	$email = $_REQUEST["email"];
	//echo $email;
	
	$password = $_REQUEST["password"];
	//echo $password;
	
	$country = $_REQUEST["country"];
	//echo $country;
	
	$db = new DB_Functions();
	$db->addUser($email, $password, $country);
//	header("location:index.html");
}
else
	die ('Error');

/*  */
?>
	