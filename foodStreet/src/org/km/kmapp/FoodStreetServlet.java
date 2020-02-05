package org.km.kmapp;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/FoodStreetServlet")
public class FoodStreetServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		String area = req.getParameter("area");
		String stallName = req.getParameter("stallName");
		String noOfItems = req.getParameter("items");
		String type = req.getParameter("type");
		
		ServletOutputStream outputstream = resp.getOutputStream();
		outputstream.print("Thankyou for visiting " + stallName);
	}

}
