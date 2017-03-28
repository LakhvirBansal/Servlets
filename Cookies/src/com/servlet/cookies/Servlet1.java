package com.servlet.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Servlet1 extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		String userName = req.getParameter("userName");
		out.print("user is "+userName+"<br>");
		
		Cookie ck = new Cookie("userName", userName);
		//ck.setMaxAge(0); //enable to delete the cookie
		res.addCookie(ck);

		out.print("<form action='servlet2'>");  
	    out.print("<input type='submit' value='go'>");  
	    out.print("</form>");  
		out.close();  
	}
}
