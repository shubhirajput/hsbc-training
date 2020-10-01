package com.hsbc.web.tr.hw10;
/**
 * @author SHUBHI
 */
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import java.io.*;
/**
 * Servlet implementation class Demo
 */
public class Demo extends GenericServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("init called!!");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy called!");
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();
			
			out.write("service called!");
	}

	
}
