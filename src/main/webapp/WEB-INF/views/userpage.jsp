<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Page</title>
</head>
<body>
	<form action="returnHome">
    	<input type="submit" value="Sign Out">
    	<br>
    	<br>
	</form>

	<h1>${result}</h1>
	
	<form action="uploadFile">
		Choose file to upload: <input type="file" name="dataFile">
		<input type="submit" value="Upload">	
	</form>	
	
	${uploadResult}
	
</body>
</html>