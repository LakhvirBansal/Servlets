package com.servlet.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Servlet2 extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");  
		PrintWriter out=res.getWriter();  
		
		Cookie ck[] = req.getCookies();
		for (Cookie cookie : ck) {
			 out.print("cookie name "+cookie.getName()+"<br>"); 
			 out.println("cookie value "+cookie.getValue()+"<br>");
			 cookie.setValue("lucky");
			 out.println("cookie new value "+cookie.getValue()+"<br>");
		}
		out.close();  
	}
	
}
