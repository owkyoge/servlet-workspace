package com.eswar.learning.level2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserServiceImpl implements UserService {

	@Override
	public int saveUserDao(User u) {

		int result = 0;
		Connection con = null;

		try {

			con = DbConnection.getDBconnection();
			con.setAutoCommit(false);

			UserDao u1 = new UserDaoImpl(con);

			try {

				result = u1.saveUserDao(u);

			} catch (Exception e) {
				e.printStackTrace();
			}

			con.commit();

		} catch (SQLException e) {
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


	@Override
	public List<User> findUserDaoImpl() {
	
		List<User> lst = null;
		Connection con = null;
		try {

			con = DbConnection.getDBconnection();
			con.setAutoCommit(false);

			UserDao u1 = new UserDaoImpl(con);

			try {

				lst = u1.findUserDaoImpl();

			} catch (Exception e) {
				e.printStackTrace();
			}

			con.commit();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return lst;

	}

}
