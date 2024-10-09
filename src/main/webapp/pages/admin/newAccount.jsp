<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Create New Account</h1>
	
	<p>${msg}</p>
		<a href = "">DashBoard</a>
		<a href = "">New Account</a>
		<a href = "">Profile</a>
		<a href = "">Logout</a>
	
	<pre>
		<form action="./account?action=create">
			<label>User Name</label>
			<input type="text" name = "username" required="required">
			
			<label>First Name</label>
			<input type="text" name = "username" required="required">
			
			<label>Last Name</label>
			<input type="text" name = "username" required="required">
			
			<label>Password</label>
			<input type="password" name = "username" required="required">
			
			<input type="submit" name = "action"value="Create">
		</form>
	</pre>

</body>
</html>