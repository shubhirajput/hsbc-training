package com.hsbc.hw1;
/**
 * @author SHUBHI
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		
		if (name.equals(pwd)) {
			RequestDispatcher dis = request.getRequestDispatcher("welcome");
			dis.forward(request, response);
		} else {
			out.print("<b>User name or password is Incorrect...</b>");
			RequestDispatcher dis = request.getRequestDispatcher("login.html");
			dis.include(request, response);
		}
		out.print("<h2><a href=\"http://www.google.co.in\" style=\"color:white\" >Click redirect to google</a></h2>");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
