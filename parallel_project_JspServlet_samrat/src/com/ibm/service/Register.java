package com.ibm.service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ibm.bean.Customer;

@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
		
		

		Customer c = new Customer();
		if (request.getParameter("email") != null && request.getParameter("dob") != null
				&& request.getParameter("cust_name") != null && request.getParameter("password")!= null
				&& request.getParameter("phno")!= null && request.getParameter("balance")!= null) {
			c.setDob(java.sql.Date.valueOf(("dob")));
			c.setEmail(request.getParameter("email"));
			c.setName(request.getParameter("cust_name"));
			c.setPassword(request.getParameter("password"));
			c.setPhone(request.getParameter("phno"));
			c.a.setBalance(Integer.parseInt(request.getParameter("balance")));
			if (new BankServiceClass().createAccount(c)) {

				HttpSession session = request.getSession();
				session.setAttribute("cust_id", new BankServiceClass().fetchCustID(c) );
				response.getWriter().print("Welcome " + c.getName());
				RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");

				dispatcher.include(request, response);

			}
		} 
		else {
			response.getWriter().print("Invalid user-data!! please again enter");
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");

			dispatcher.include(request, response);
		}

	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
