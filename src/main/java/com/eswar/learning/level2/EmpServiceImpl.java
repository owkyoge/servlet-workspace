package com.eswar.learning.level2;

import java.sql.Connection;
import java.sql.SQLException;

public class EmpServiceImpl implements EmpService {

	@Override
	public int saveEmpDao(Employee emp1) {
		int result = 0;
		Connection con = null;
		try {
			con = DbConnection.getDBconnection();
			con.setAutoCommit(false);

			EmpDao emp = new EmpDaoImpl(con);

			 result = emp.saveEmpDao(emp1);

			con.commit();

		} catch (Exception e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

}
