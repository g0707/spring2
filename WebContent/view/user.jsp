<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 
<form  method="post" action="verifyUser">
<table>
<tr>
<td>Enter Name</td>
<td>:</td>
<td><input type="text" name="na"></td>
</tr>
<tr>
<td>Enter Password</td>
<td>:</td>
<td><input type="password" name="pass"></td>
</tr>
<tr>
<td></td>
<td></td>
<td><input type="submit"></td>
</tr>
</table>
	
</form>

<font color="red"><h1>${result}</h1></font>
</body> 
</html>