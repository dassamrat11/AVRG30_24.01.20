package com.ibm.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import com.ibm.bean.*;




@WebServlet("/login")
public class Login extends HttpServlet {
   private static final long serialVersionUID = 1L;

   protected void doPost(HttpServletRequest request,
         HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String cid = request.getParameter("cust_id");
      String pwd = request.getParameter("password");
      Customer c=new Customer();
      c.setId(Integer.parseInt(cid));
      c.setPassword(pwd);
      BankServiceClass bs=new BankServiceClass();
      if (bs.login(c)) {
         out.print("Welcome, " + bs.fetchName(c)+"you are succesfully logged in" );
         HttpSession session = request.getSession(true); 
                                            
                                             
         session.setAttribute("cust_id", cid);
         session.setMaxInactiveInterval(5); 
         response.sendRedirect("welcome.jsp");
      } else {
         RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
         out.println("<font color=red>Either user name or password is wrong.</font>");
         rd.include(request, response);
      } 
   }
}