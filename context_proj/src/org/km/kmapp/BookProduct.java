package org.km.kmapp;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bp")
public class BookProduct extends HttpServlet {

	@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {

			Product pro = new Product();
			pro.id = 2;
			pro.name = "mobile";
			pro.price = 10000;
			pro.brand = "magestic";

			ServletContext context = getServletContext();
			String ref1 = context.getInitParameter("name1");
			String ref2 = context.getInitParameter("name2");

			ServletOutputStream servletOutputStream = resp.getOutputStream();
			servletOutputStream.print("<html><body bgcolor='lightpink'>" + "<h1>'" + ref1 + "'  '" + ref2 + "' </h1>"
					+ " <h2>thank u for selecting book ''" + pro.name + "'' </h2>" + "<a href='context.html'>Back</a>"
					+ "</body></html>");
		}
	}

