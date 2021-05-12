<?php
include_once './db_functions.php';
if(isset($_POST['signup']))
{
    if (isset($_REQUEST["email"]))
    {
    	$email = $_REQUEST["email"];
    	
    	$db = new DB_Functions();
    	
    	$db->isValidUser($email);
    }
}
?>
	