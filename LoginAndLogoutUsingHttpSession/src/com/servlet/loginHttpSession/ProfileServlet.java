package com.servlet.loginHttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class ProfileServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		
		req.getRequestDispatcher("link.html").include(req, res);
		
		HttpSession session = req.getSession(false);
		
		if(session != null){
			String user = (String) session.getAttribute("userName");
			writer.println("the logged in user is :"+user);
		} else{
			writer.println("Please log in again");
			req.getRequestDispatcher("login.html").include(req, res);
		}
		writer.close();
	}
}
