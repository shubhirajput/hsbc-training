package com.hsbc.web.tr.hw10;
import java.io.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
/**
 * Servlet implementation class GenExample
 */
   
	public class GenExample extends GenericServlet {

		@Override
		public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();
			
			out.write("<h1>Welcome to Servlet Programming</h1>");

		}

	}


