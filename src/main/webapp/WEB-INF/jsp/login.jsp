<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%@include file = "/static/link.html"%>

<html>
<head>
<meta charset="UTF-8">
<title>Create Account</title>
</head>
<body>

	<form method="post" action="/loginProcess">
		<b>Enter Username: </b>
		<input type="text" name="username"/><br>
		<b>Enter Password: </b>
		<input type="password" name="password"/><br>
		
		<input type="submit" value="loginProcess"/>
	</form>
</body>
</html>