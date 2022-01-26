package com.eswar.learning.level1;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {

		System.out.println("Initialing");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Serviceing");
	}

	public void destroy() {

		System.out.println("Destroying");
	}
}
