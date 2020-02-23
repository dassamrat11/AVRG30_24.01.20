<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="com.ibm.service.DoLogin" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to SAS Wallet</title>
</head>
<body>
<form action="dologin" method="get">
<h3>
Are you a existing user?
<br>
  
    <input type="radio" name="answer" value="Yes">
   Yes

  
    <input type="radio" name="answer" value="No">
    No
    
    <br>
    <br>
    <br>
    <input type="submit" value="Submit">
</h3>
</form>
</body>
</html>