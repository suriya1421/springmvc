<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Employee</title>
</head>
<body>
<form action="/FirstJSPproject/AddEmployee" method="post">
		<!--need to mention method = post  -->
		<center>
			<div>
				ID : <input type='text' name='id'>
			</div>
			<div>
			 <input
				type='submit' name='click' value='delete_emp'>
				</div>
		</center>
	</form>
</body>
</html>