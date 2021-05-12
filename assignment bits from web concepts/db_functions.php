<?php
 include_once 'db_connect.php' ;
class DB_Functions {
	private $db;
	private $con;
	
// constructor
    function __construct() {
	  
	   $this->db = new DB_Connect();
	   $this->con = $this->db->connect();
	}
	public function addUser ($email,$password,$country){
		var_dump(array($email, $password, $country));
		$query="INSERT INTO Users(email,password,country) VALUES ('$email','$password','$country');";
		$res = mysqli_query($this->con,$query);
		
		var_dump($res);
		if($res == true)
		{
		    echo "<script>alert('Success');</script>";
		}
		else
		    ;// echo "<script>alert('Error');</script>";
	}
	public function isValidUser($email){
	$query="SELECT * FROM Users WHERE email = '$email'";
	if ($query==true){
	    return true;
	}
		else 
			return false;
	}
}
?>