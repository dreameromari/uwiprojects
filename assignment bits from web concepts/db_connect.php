<?php
class DB_Connect   {
public function connect() {
	require_once 'config.php' ;
	$con = mysqli_connect(DB_HOST, DB_USER, DB_PASSWORD, DB_DATABASE);
	if (mysqli_connect_errno()){
		echo "Failed to connect to MySQL: " . mysqli_connect_error();
		return null;
	}
	
	else{
		
		return $con;

	    }
		
public function close() {
	mysqli_close();
   }
}
?>    