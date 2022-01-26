package com.eswar.learning.level2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeptController")
public class DeptController extends HttpServlet {
	public void init(ServletConfig config) throws ServletException {
	//	  http://localhost:8080/Sevrlet_Workspace/DeptController?deptID=1&deptName=EEE&name=YogiMarthand&salary=5000
		//	  http://localhost:8080/Sevrlet_Workspace/DeptController?deptID=1&deptName=EEE&name=YogiMarthand&salary=5000

		
		System.out.println("Initialing");

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Serviceing");
		
		String id = request.getParameter("deptID");
		String dName = request.getParameter("deptName");
		String name = request.getParameter("name");
		String salary = request.getParameter("salary");
		
		
		System.out.println("id");
		System.out.println("dName");
		System.out.println("name");
		System.out.println("salary");
		
		Department d = new Department();
		
		int nId = Integer.parseInt(id);
		d.setDeptID(nId);
		d.setDeptName(dName);
		d.setName(name);
		d.setSalary(salary);
		
		DeptService deptService = new DeptServiceImpl();
		int result = deptService.saveDeptDao(d);
	
		RequestDispatcher rd = request.getRequestDispatcher("/succes.jsp");
		rd.forward(request, response);
		
		
	}

	public void destroy() {

		System.out.println("Destroying");

	}
}
