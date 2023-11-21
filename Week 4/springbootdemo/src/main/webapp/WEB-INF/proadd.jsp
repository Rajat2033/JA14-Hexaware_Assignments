<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>Adding Products</title>
</head>
<body>

<h1 style="color: red">Welcome To Adding Products Form</h1>
<form action="http://localhost:8080/products/addpro" method="Post">
Product id<input type="number" name="id"><br/><br/><br/>
Product Name<input type="text" name="proName"><br/><br/><br/>
Product amount<input type="number" name="amount"><br/><br/><br/>
<button style="color:green">Add</button>
</form>
</body>
</html>