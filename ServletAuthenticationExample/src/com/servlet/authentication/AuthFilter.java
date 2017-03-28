package com.servlet.authentication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AuthFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		
		resp.setContentType("text/html");
		PrintWriter writer =  resp.getWriter();
		
		String password = req.getParameter("password");
		if("admin".equals(password)){
			chain.doFilter(req, resp);
		} else{
			writer.println("you entered wrong password. please try again");
			req.getRequestDispatcher("index.html").include(req, resp);
		}
		
		writer.close();
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
