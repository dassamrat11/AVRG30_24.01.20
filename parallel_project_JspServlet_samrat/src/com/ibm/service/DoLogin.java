package com.ibm.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import javax.servlet.RequestDispatcher;

@WebServlet("/dologin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		if(request.getParameter("answer").equals("Yes")) {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
			
			
			dispatcher.include(request, response);
			
			
		}
		else
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");
			
			
			dispatcher.include(request, response);
			
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
