package com.app.DaoI;

import com.app.Entity.User;

public interface UserDaoI {

	Integer loginUser(String name, String password);

	Integer saveUser(User user);

}
