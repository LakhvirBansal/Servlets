package com.servlet.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ServletDemo extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		 
		res.setContentType("text/html");  
	    PrintWriter out = res.getWriter();  
	      
	    out.print("<br>welcome to servlet<br>");  
	}
}
