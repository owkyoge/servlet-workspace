package com.eswar.learning.level2;

import java.sql.Connection;
import java.sql.Statement;

public class DeptDaoImpl implements DeptDao {
	
	Connection con;
	
	public DeptDaoImpl(Connection con) {
		this.con=con;
	}
	
    @Override
	public int saveDeptDao(Department d) throws Exception {
		
		int id = d.getDeptID();
		String name = d.getName();
		String dName = d.getDeptName();
		String salary = d.getSalary();
		
		Statement st = con.createStatement();
		int result = st.executeUpdate("INSERT INTO Department (deptID,deptName,name,salary) "
				+ "VALUES("+id+", '"+name+"' , '"+dName+"' , "+salary+")");
		System.out.println(result);
		return result;
	}
    
    
    

}
