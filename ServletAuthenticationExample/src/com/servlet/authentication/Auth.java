package com.servlet.authentication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Auth extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String userName = req.getParameter("name");
		out.println("welcome :"+userName);
		out.close();
	}
}
