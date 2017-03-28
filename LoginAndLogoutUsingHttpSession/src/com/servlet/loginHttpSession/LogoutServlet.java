package com.servlet.loginHttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class LogoutServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		
		req.getRequestDispatcher("link.html").include(req, res);
		HttpSession session = req.getSession();
		
		if(session != null){
			session.invalidate();
		}
		
		writer.println(" u r logged out successfully ");
		writer.close();
		
		
	}
}
