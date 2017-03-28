package com.servlet.servletRequest;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class DemoServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		res.setContentType("text/html");  
		PrintWriter pw=res.getWriter();  
		  
		String name=req.getParameter("name");//will return value  
		pw.println("Welcome "+name+"<br>");  
		String attr = (String) req.getAttribute("name");
		pw.println("hiii "+attr+"<br>");
		pw.println("HTTP headers sent by your client:<br>");  
	        
		Enumeration enumData = req.getHeaderNames();  
        while (enumData.hasMoreElements()) {  
	        String headerName = (String) enumData.nextElement();  
	        String headerValue = req.getHeader(headerName);  
	        pw.print("<b>"+headerName + "</b>: ");  
	        pw.println(headerValue + "<br>");  
        }
        
        int length = req.getContentLength();
        pw.println("contentLength is "+length+"<br>");
        
        int serverPort = req.getServerPort();
        pw.println("serverPortNo is "+serverPort+"<br>");
        
        String serverName = req.getServerName();
        pw.println("serverName is "+serverName+"<br>");
        pw.close(); 
        
	}
}
