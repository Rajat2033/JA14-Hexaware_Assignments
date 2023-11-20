<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Information</title>
</head>
<body>
	<h1 style="color: orangered;" >Enter Students Data</h1>
	<form action=" http://localhost:8080/students/data" method="post">
		Student Name<input type="text" name="name"><br/><br/><br/>
		Student Roll No<input type="number" name="roll"><br/><br/><br/>
		Student Class<input type="number" name="classn"><br/><br/><br/>
		Student City<input type="text" name="city"><br/><br/><br/>
		<button style="color:yellowgreen">Submit</button>
		
	</form>

</body>
</html>