package com.servlet.requestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Success extends HttpServlet{

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		res.setContentType("text/html");  
	    PrintWriter out = res.getWriter();  
	          
	    String userName = req.getParameter("userName");  
	    out.println("successful login :"+userName);
	}
}
