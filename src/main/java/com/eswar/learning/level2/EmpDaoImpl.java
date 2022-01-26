package com.eswar.learning.level2;

import java.sql.Connection;
import java.sql.Statement;

public class EmpDaoImpl implements EmpDao {
	
	Connection con;

	public EmpDaoImpl(Connection con) {
		this.con = con;
	}


	@Override
	public int saveEmpDao(Employee e) throws Exception {
		
		
		int id = e.geteID();
		String name = e.geteName();
		String salary = e.geteSalary();
		String phNo = e.getePhNo();
		String village = e.geteVillage();
		String mandal = e.geteMandal();
		String dist = e.geteDist();
		String state = e.geteState();
		String country = e.geteCountry();
		int pinCode = e.getePinCode();
		String marriStatus = e.geteMarriStatus();
		
		
		
		String qry = "INSERT INTO S_EMPLOYEE (E_ID , E_NAME , E_SALARY , E_PHNO , E_VILLAGE , E_MANDAL , E_DIST , E_STATE, E_COUNTRY , E_PINCODE , E_MARRISTATUS ) "
				                + " VALUES ("+id+" , '"+name+"' , "+salary+" , "+phNo+" , '"+village+"' ,'"+mandal+"', '"+dist+"' , '"+state+"' ,'"+country+"' , "+pinCode+" , '"+marriStatus+"')";
		System.out.println(qry);
		Statement st = con.createStatement();
		int result = st.executeUpdate(qry);
		System.out.println(result);
		return result;

		
}

}