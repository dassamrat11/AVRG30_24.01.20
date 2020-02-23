package com.ibm.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

import javax.servlet.http.HttpSession;


@WebServlet("/logout")
public class Logout extends HttpServlet {
   private static final long serialVersionUID = 1L;

   protected void doPost(HttpServletRequest request,
         HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      out.println("Thank you!!, Your session was destroyed successfully!! Bye Bye!!");
      HttpSession session = request.getSession(false);
      session.removeAttribute("cust_id");
      session.getMaxInactiveInterval();
   }
}