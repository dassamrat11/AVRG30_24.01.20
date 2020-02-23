<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="com.ibm.service.BankServiceClass"%>
<%@page import="com.ibm.bean.Customer"%>
<%@page import="com.ibm.dao.DaoClass"%>



<!DOCTYPE html>
<html>


<head>
<meta charset="ISO-8859-1">
<title>Welcome to SAS:Home</title>
</head>
<body>
<form action="option.jsp" method="post">

<%
      if (session != null) {
         if (session.getAttribute("cust_id") != null) {
            String name = (String) session.getAttribute("cust_id");
            out.print("Hello, " + name + "  Welcome to your Profile");
   %>
  
Menu



<br>
<i>  
  
   <input type="radio" name="choose" value="View">
  View
<br>

    <input type="radio" name="choose" value="Withdraw">
   Withdraw
   <br>
  
   
  
    <input type="radio" name="choose" value="Deposit">
  Deposit
<br>
  

  
    <input type="radio" name="choose" value="Transfer">
  Transfer
<br>
  
 
  
    <input type="radio" name="choose" value="Check">
  Check Balance status
  <br>
  
  
    <input type="radio" name="choose" value="Print">
  Your Transactions
  <br>
  
  
    <input type="radio" name="choose" value="Logout">
   Logout
 </i>
 <input type="Submit" name="Submit">
 
 <%
         } 
         else {
            response.sendRedirect("login.jsp");
         }
      
	  }
	  else{
	   response.sendRedirect("index.jsp");
	  
	  } 
	


%>
</form>
</body>
</html>