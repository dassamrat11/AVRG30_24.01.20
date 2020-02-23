<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<form action="operation.jsp" method="post">

<%

if(request.getParameter("choose").equals("Withdraw")) {
	session.setAttribute("operation", 1);
	%>
	Enter amount 
	<input type="number" value="wdamount" name="wdamount">
	<%
}

else if(request.getParameter("choose").equals("View")) {
	
	session.setAttribute("operation", 2);
	
	RequestDispatcher dispatcher = request.getRequestDispatcher("operation.jsp");
	
	
	dispatcher.include(request, response);
}

else if(request.getParameter("choose").equals("Deposit")) {
	session.setAttribute("operation", 3);
	%>
	Enter amount to deposit
	<input type="number" value="deposit" name="deposit">
	<%
}

else if(request.getParameter("choose").equals("Transfer")){
	session.setAttribute("operation", 4);
	%>
	Enter amount to transfer
	<input type="number" value="Transfer" name="Transfer">
	<br>
	<br>
	Enter recivers acc no
	<input type="number" value="acc" name="acc">
	
	<% 
	}
	else if(request.getParameter("choose").equals("Check")) {
		session.setAttribute("operation", 5);
RequestDispatcher dispatcher = request.getRequestDispatcher("operation.jsp");


dispatcher.include(request, response);
}
	
	else if(request.getParameter("menu").equals("Print")) {
		session.setAttribute("operation", 6);
RequestDispatcher dispatcher = request.getRequestDispatcher("operation.jsp");
	
	
	dispatcher.include(request, response);
}
	
	else if(request.getParameter("choose").equals("Logout")) {
		session.setAttribute("operation", 7);
RequestDispatcher dispatcher = request.getRequestDispatcher("operation.jsp");
	
	
	dispatcher.include(request, response);
}
	%>


<input type="submit" value="submit">
</form>
</body>
</html>