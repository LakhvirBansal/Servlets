package com.servlet.loginHttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		
		req.getRequestDispatcher("link.html").include(req, res);
		String user = req.getParameter("name");
		String pwd = req.getParameter("password");
		HttpSession session = req.getSession();
		if("admin123".equals(pwd)){
			writer.println(" ur logged in successfully ");
			session.setAttribute("userName", user);
		} else{
			writer.println(" u entered wrong password ");
			req.getRequestDispatcher("login.html").include(req, res);
			session.invalidate();
		}
		writer.close();
	}
}
