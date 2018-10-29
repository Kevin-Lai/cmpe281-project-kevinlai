<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up Page</title>
</head>
<body>
	<form action="returnHome">
    	<input type="submit" value="Home">
    	<br>
    	<br>
	</form>

	<form action= "createAccount">
	
		Enter First Name: <input type="text" name="firstName"><br>
		Enter Last Name: <input type="text" name="lastName"><br>
		Enter Email Address : <input type="text" name="username"><br>
		Enter Password : <input type="password" name="password"><br>
		Confirm Password : <input type="password" name="confirmPassword"><br>
		<input type="submit" value="Create Account">
	
	</form>
	
	${result}
	
</body>
</html>