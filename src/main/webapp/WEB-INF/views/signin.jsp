<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<form action="returnHome">
    	<input type="submit" value="Home">
    	<br>
    	<br>
	</form>

	<form action="submitSignIn">
	
		Enter Email Address : <input type="text" name="username"><br>
		Enter Password : <input type="password" name="password"><br>
		<input type="submit" value="Sign In">
	
	</form>
	
	${result}
	
</body>
</html>