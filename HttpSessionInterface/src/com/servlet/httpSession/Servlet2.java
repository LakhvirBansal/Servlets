package com.servlet.httpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class Servlet2 extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		res.setContentType("text/html");  
	     PrintWriter out = res.getWriter();  
	     
	     HttpSession session  = req.getSession(false);
	     String sessionId = session.getId();
	     out.println("session id :"+sessionId);
	     
	     boolean isNew = session.isNew();
	     out.println("isNew is :"+isNew);
	     
	     //session.invalidate(); if we uncomment this line then next lines is not execute
	  
	     String value = (String) session.getAttribute("userName");
	     out.println("the value is "+value);
	     
	     out.close();
	     
	}
}
