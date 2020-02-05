package org.km.kmapp;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/ep")

public class ElectronicServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req,ServletResponse resp)
			throws ServletException,IOException {
		
		Product product = new Product();
		
		product.id = 1;
		product.name = "Ear phone";
		product.price = 100.0;
		product.brand = "megistic";
		
		ServletContext context = getServletContext();
		String ref1 = context.getInitParameter("name1");
		String ref2 = context.getInitParameter("name2");
		
		ServletOutputStream servletOutputStream= resp.getOutputStream();
		servletOutputStream.print("<html><body bgcolor='pink'>" 
				+ "<h1>Thank you for selecting electronic''" +product.name +"'' </h1>"
				+"<a href=\'context.html\'>Back</a>"
				+"</body></html>");
	}
	
}
