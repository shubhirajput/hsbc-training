package com.hsbc.web.tr.hw10;

import java.io.IOException;
import java.io.*;
import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Print
 */
public class Print extends HttpServlet{
	
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		out.write("<h1>HI,This is "+req.getParameter("name")+"</h1>");
	}

}
