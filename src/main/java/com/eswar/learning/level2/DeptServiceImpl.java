package com.eswar.learning.level2;

import java.sql.Connection;
import java.sql.SQLException;

public class DeptServiceImpl implements DeptService {

	@Override
	public int saveDeptDao(Department d) {
		int result = 0;
		Connection con = null;
		
			try {
				con = DbConnection.getDBconnection();
				
				con.setAutoCommit(false);
				
				DeptDao dimpl = new DeptDaoImpl(con);

				 result = dimpl.saveDeptDao(d);
				 
					con.commit();
				 
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			
			return result;

		
		
		
	}
	
	
}
