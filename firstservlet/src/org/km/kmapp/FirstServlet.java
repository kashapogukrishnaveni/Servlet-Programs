package org.km.kmapp;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/register")
public class FirstServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("nm");
		
		String emailId = req.getParameter("email");
		
		String password = req.getParameter("password");
	
		ServletOutputStream outputstream =  resp.getOutputStream();
		outputstream.print("welcome " + name);
	}
	

}
