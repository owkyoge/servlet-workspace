package com.eswar.learning.level2;

import java.sql.SQLException;
import java.util.List;

public interface UserService {

	int saveUserDao(User u) throws SQLException;

	List<User> findUserDaoImpl();

}
