package com.servlet.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet{

	  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException  {
		  
		  response.setContentType("text/html");  
	      PrintWriter out=response.getWriter();  
	      RequestDispatcher dispatcher = request.getRequestDispatcher("link.html");
	      dispatcher.include(request, response);
	      
	      String name=request.getParameter("name");  
	      String password=request.getParameter("password");  
	      
	      if("good".equals(password)){
	    	  out.print("You are successfully logged in!");  
	          out.print("<br>Welcome, "+name);  
	          Cookie ck=new Cookie("name",name);  
	          response.addCookie(ck);  
	      } else{
	    	  out.print("sorry, username or password error!");  
	          request.getRequestDispatcher("login.html").include(request, response);  
	      }
	      
	      out.close();
	  }
}
