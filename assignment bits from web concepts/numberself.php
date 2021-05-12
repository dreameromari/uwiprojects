<!DOCTYPE html>
<html>
<head>
<title> Number Check</title>
 <link rel="stylesheet" type="text/css" href="styles1.css">
 <meta charset= "UTF-8">
</head>
<body>
<div class = "number-box">
   <h1>Tester</h1>
   <form method = "post">
   <p>Number</p>
   <input type="number" name="number" placeholder="Enter a number">
   <input type="Submit" name="Submit" value="Submit"> 
   </form>
 </div>
 	<?php 
	$newsCon = new mysqli('localhost','id4648386_damar','virgo78', 'id4648386_newscentral');
		if ($newsCon)
		{
		//echo "success";
		
		//$num = $_REQUEST['number'];							//assign num to textile(user input)
			
			if (isset($_REQUEST['number']))					//check if user input matches back to database
			{
		    $num = $_REQUEST['number'];
			$sql = "SELECT * FROM Users LIMIT $num ";
			
			$result = mysqli_query($newsCon, $sql);
			
				if (mysqli_num_rows($result) == 0)
				{
					echo ("	No records  have been found");
					mysqli_close($newsCon);
					exit;
				}
			
		
		else
		{
			
			echo "<table border = '1' cell padding '10'>";
			echo "<tr style = 'background-color = #00000'>";
			echo "<th style = 'font color = #FFFFF'>number</th>";
			echo "<th style = 'font color = #FFFFF'>email</th>";
			echo "<th style = 'font color = #FFFFF'>password</th>";
			echo "<th style = 'font color = #FFFFF'>counrty</th>";
			echo "</tr>";
		
			
			While($row = mysqli_fetch_assoc($result))
			{
				echo "<tr>";
				echo "<td>".$row["number"]."</td>";
				echo "<td>".$row["email"]."</td>";
				echo "<td>".$row["password"]."</td>";
				echo "<td>".$row["country"]."</td>";
				echo "</tr>";
			}
				echo "</table>";
				
				mysqli_free_result($result);
				mysqli_close($newsCon);
		}
		}
		}
?>
 </body>
 </html>