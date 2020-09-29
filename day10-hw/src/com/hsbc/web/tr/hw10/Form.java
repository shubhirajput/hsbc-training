package com.hsbc.web.tr.hw10;

import java.io.IOException;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form
 */
public class Form extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();
			
			String name=req.getParameter("name");
			String email=req.getParameter("email");
			
			out.print("<h2>Details submitted:</h2>");
			out.print("<br>Name: "+name+"<br>Email: "+email);
	}
	
}
