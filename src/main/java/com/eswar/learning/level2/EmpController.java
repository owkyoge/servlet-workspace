package com.eswar.learning.level2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmpController")
public class EmpController extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
 // http://localhost:8080/Sevrlet_Workspace/EmpController?empID=1&empName=Yogi&empSalary=1000&empPhNo=8886950259&empVillage=BPL&empMandal=BPL&empDist=KNL&empState=AP&empCountry=INDIA&empPinCode=518124&empMarriStatus=NO		
		System.out.println("Initialing");
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Serviceing");

		String id = request.getParameter("empID");
		String name = request.getParameter("empName");
		String salary = request.getParameter("empSalary");
		String phno = request.getParameter("empPhNo");
		String village = request.getParameter("empVillage");
		String mandal = request.getParameter("empMandal");
		String dist = request.getParameter("empDist");
		String state = request.getParameter("empState");
		String country = request.getParameter("empCountry");
		String pincode = request.getParameter("empPinCode");
		String marrists = request.getParameter("empMarriStatus");

		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(phno);
		System.out.println(village);
		System.out.println(mandal);
		System.out.println(dist);
		System.out.println(state);
		System.out.println(country);
		System.out.println(pincode);
		System.out.println(marrists);

		Employee e = new Employee();
		
		int eid = Integer.parseInt(id);
		
		e.seteID(eid);
		e.seteName(name);
		e.seteSalary(salary);
		e.setePhNo(phno);
		e.seteVillage(village);
		e.seteMandal(mandal);
		e.seteDist(dist);
	    e.seteState(state);
	    e.seteCountry(country);
	    int epincode = Integer.parseInt(pincode);
	    e.setePinCode(epincode);
	    e.seteMarriStatus(marrists);
		
		 EmpService empService = new EmpServiceImpl();
		 int result = empService.saveEmpDao(e);
		 
		 RequestDispatcher rd=request.getRequestDispatcher("/success.jsp");  
		
		rd.forward(request, response);
		 
	}
	@Override
	public void destroy() {

		System.out.println("Destroying");
	}
}
