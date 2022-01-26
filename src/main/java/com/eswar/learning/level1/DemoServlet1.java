package com.eswar.learning.level1;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet1")
public class DemoServlet1 extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {

		System.out.println("Initialing");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Serviceing");

		String nm = request.getParameter("name");
		System.out.println(nm);

		
	}

	public void destroy() {

		System.out.println("Destroying");
	}
}
