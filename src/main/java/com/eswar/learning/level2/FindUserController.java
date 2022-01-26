package com.eswar.learning.level2;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FindUserController")
public class FindUserController extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Initialing");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Serviceing");

		UserService uService = new UserServiceImpl();

		List<User> list = uService.findUserDaoImpl();

		request.setAttribute("al", list);
		RequestDispatcher rd = request.getRequestDispatcher("/userdetails.jsp");
		rd.forward(request, response);

	}

	public void destroy() {

		System.out.println("Destroying");

	}

}
