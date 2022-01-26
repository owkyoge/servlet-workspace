package com.eswar.learning.level2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public  class UserDaoImpl implements UserDao {

	
Connection con;
	
	public UserDaoImpl(Connection con) {
		this.con=con;
	}
	
    @Override
	public int saveUserDao(User u) throws Exception {
		
    	
         int id = u.getUserID(); 
    	 String uName = u.getUserName();
         String pw = u.getPassword();
         long phNo = u.getPhNo();
		
		Statement st = con.createStatement();
		int result = st.executeUpdate("INSERT INTO user_me (UserId , UserName ,UserPassword , UserPhNo ) "
			                                  	+ "VALUES ("+id+" , '"+uName+"' , '"+pw+"' , "+phNo+")");
		System.out.println(result);
		
		System.out.println(id);
		System.out.println(uName);
		System.out.println(pw);
		System.out.println(phNo);
		return result;
	}
    @Override
    public List<User> findUserDaoImpl() throws Exception {
    	
    	List<User> l = new ArrayList<User>();
    	
    	Statement st = con.createStatement();
    	ResultSet result = st.executeQuery("SELECT UserId , UserName , UserPassword , UserPhNo FROM user_me");
    	while (result.next()) {
    		
    		User u = new User();
    		u.setUserID(result.getInt("UserId"));
    		u.setUserName(result.getString("UserName"));
    		u.setPassword(result.getString("UserPassword"));
    		u.setPhNo(result.getLong("UserPhNo"));
    		
    	
    		l.add(u);
    		
    	}
		return l;
    }

	
}
