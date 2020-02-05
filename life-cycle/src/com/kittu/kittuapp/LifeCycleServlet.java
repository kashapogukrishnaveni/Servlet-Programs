package com.kittu.kittuapp;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
@WebServlet(urlPatterns="/lifecycle",loadOnStartup=1,initParams= {
		@WebInitParam(name="jingalala",value="ulala"),
		@WebInitParam(name="name",value="kittu"),
		@WebInitParam(name="age",value="21")
		
})
public class LifeCycleServlet extends GenericServlet {
	
	public LifeCycleServlet() {
		System.out.println("servlet object is created");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Intializating the resources of LifeCycleResourecs");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		ServletConfig config = getServletConfig();
		String name = config.getInitParameter("jingalala");
		String age = config.getInitParameter("age");
		String Myname = config.getInitParameter("name");
		
		System.out.println("service method is executed");
		
		String appNmae = req.getParameter("appNmae");
		String appSize = req.getParameter("appSize");
		String appVersion = req.getParameter("appVersion");
	
	}
	@Override
	public void destroy() {
		System.out.println("closing the resources");
	}

}
