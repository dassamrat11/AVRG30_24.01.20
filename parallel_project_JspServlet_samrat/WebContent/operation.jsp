<%@page import="com.ibm.bean.Transaction"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.InputMismatchException"%>
<%@page import="org.eclipse.jdt.internal.compiler.ast.NullAnnotationMatching"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.ibm.service.BankServiceClass"%>
<%@page import="com.ibm.bean.Customer"%>
<%@page import="com.ibm.dao.DaoClass"%>

    
 <%! int option;  
 BankServiceClass sc=new BankServiceClass();
 Customer c=new Customer();
 ArrayList<Customer> rs=new ArrayList<>();
 Integer amount=0,acc;
 ArrayList<Transaction>t=new ArrayList<>();
 %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<form action="welcome.jsp" method="post">


<%
if (session.getAttribute("cust_id") != null) {
	BankServiceClass sc=new BankServiceClass();
%>






<%


c.setId((Integer)request.getSession().getAttribute("cust_id"));
option=(Integer)session.getAttribute("option");
switch(option)
{
case 1: 
	try{
	amount=Integer.parseInt(request.getParameter("wdamount"));
	
	if(sc.withdrawal(c,amount)){
	%>

	Successfully withdrawn
	<%
	}
	else 
	{
		%>
		Check your balance n try again
	
	<% 
	}
	}catch(NumberFormatException n){
		out.println("Enter valid amount");
		RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
		
		dispatcher.include(request, response);
	}
	




break;
case 2:
	
 rs=sc.viewBalance(c);
for(Customer k:rs)
	out.println(k);
break;
case 3:
	
	
	try{
		amount=Integer.parseInt(request.getParameter("deposit"));
		
		if(sc.deposit(c, amount)){
			%>
			Successfully withdrawn
			<%
			
	}
			else
			{
			%>
		Please try again latter
		<% 
			}
		}catch(NumberFormatException n){
			out.println("Enter valid amount");
			RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
			
			dispatcher.include(request, response);
		}

break;
case 4:
	
	
	
	try{
		amount=Integer.parseInt(request.getParameter("Transfer"));
		acc=Integer.parseInt(request.getParameter("acc"));
		if(sc.send(c,acc,amount)){
		%>
		successfully sent
	<% 
		}
		else
		{
			%>
			Check ur balance n try again
			
		<%
		}
		}catch(NumberFormatException n){
			out.println("Enter valid amount");
			RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
			
			dispatcher.include(request, response);
		}

break;
case 5:
	if(sc.isLowBalance(c))
	
	out.print("Account is in low-balance state...");
	else 
		out.println("Account status is healthy..");
	break;
case 6:
	
	t=sc.printTransaction(c);
	for(Transaction k:t)
		out.println(k);
	break;

case 7:
	System.out.println("Successfully logged out");
	out.println("Successfully logged out");
	session.invalidate();
	
}
%>
<input type="submit" value="Back to main Menu">

<%
 }

  else {
	 
	 response.getWriter().println(" Please Login Again...<br><br>");
	  
	  
	  
	 request.getRequestDispatcher("index.jsp").include(request, response);
	  
  }



%>
</form>
</body>
</html>