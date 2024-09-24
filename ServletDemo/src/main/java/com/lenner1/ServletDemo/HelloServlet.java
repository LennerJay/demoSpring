package com.lenner1.ServletDemo;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jakarta.servlet.annotation.WebServlet;


@WebServlet("/hello")
public class HelloServlet extends HttpServlet{

	
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
	    res.setContentType("text/html");
	    PrintWriter out = res.getWriter();
	    res.setStatus(HttpServletResponse.SC_OK); // Set the status to 200 OK
	    out.println("<h1>Hello World!</h1>");
	}
}
