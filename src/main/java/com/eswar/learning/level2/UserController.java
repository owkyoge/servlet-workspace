package com.eswar.learning.level2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UsrController")
public class UserController extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Initialing");
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("Serviceing");
		
		
		String id = request.getParameter("userID");
		String userName = request.getParameter("userName");
		String pw = request.getParameter("password");
		String phno = request.getParameter("phNo");
		
		
		System.out.println("userID");
		System.out.println("userName");
		System.out.println("password");
		System.out.println("phNo");
		
		
		
		User u = new User();
		int iD = Integer.parseInt(id);
		u.setUserID(iD);
		u.setUserName(userName);
		u.setPassword(pw);
		long phoneNo = Long.parseLong(phno);
		u.setPhNo(phoneNo);
		
		
		UserServiceImpl userService = new UserServiceImpl();
		userService.saveUserDao(u);
		
		
		request.setAttribute("su", "Helloworld");
		
		
	
		
		RequestDispatcher rd = request.getRequestDispatcher("/success.jsp");
		rd.forward(request, response);
		
		
		
	}

	@Override
	public void destroy() {
		
		System.out.println("Destroying");

	}

 }
