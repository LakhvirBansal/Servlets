package com.servlet.requestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Servlet2 extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");  
		PrintWriter out=res.getWriter();  
		
		ServletContext context=getServletContext();  
		String companyName=(String)context.getAttribute("company");  
		  
		out.println("Welcome to "+companyName);  
		out.close();  
	}
	
}
