package com.servlet.requestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Login extends HttpServlet{

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		res.setContentType("text/html");  
	    PrintWriter out = res.getWriter();  
	          
	    String userName = req.getParameter("userName");  
	    String pwd = req.getParameter("userPass"); 
	    //res.sendRedirect("http://www.google.com");
	    ServletConfig config = getServletConfig();
	    Enumeration enumval = config.getInitParameterNames();
	    while (enumval.hasMoreElements()) {
			String str = (String) enumval.nextElement();
			String val = config.getInitParameter(str);
			out.println(val+"<br>");
		}
	    out.println(config.getServletName()+"<br>");
	    
	    ServletContext context = getServletConfig().getServletContext();
	    out.println(context.getInitParameter("dname"));
	    out.close();
	 /*   if("correct".equals(pwd)){
	    	RequestDispatcher rd = req.getRequestDispatcher("success");
	    	rd.forward(req, res);
	    }
	    else{
	    	out.println(" Password is not correct ");
	    	RequestDispatcher rd=req.getRequestDispatcher("/index.html");  
	        rd.include(req, res);
	    }*/
	}
}
