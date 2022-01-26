package com.eswar.learning.level2;

import java.util.List;

public interface UserDao {

	int saveUserDao(User u) throws Exception;


	public abstract List<User> findUserDaoImpl() throws Exception;

}
