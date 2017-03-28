package com.servlet.httpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class Servlet1 extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		String userName = request.getParameter("userName");
		writer.println("userName is :"+userName);
		
		HttpSession session = request.getSession();
		session.setAttribute("userName", userName);
		
		writer.print("<a href='servlet2'>visit</a>");  
		
		writer.close();
	}
}
