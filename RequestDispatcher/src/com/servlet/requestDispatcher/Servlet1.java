package com.servlet.requestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Servlet1 extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		PrintWriter out = res.getWriter();
		ServletContext context = getServletContext();
		context.setAttribute("company", "netsmartz");
		out.println("<a href='servlet2'>visit</a>");  
		out.close();  
	}
}
