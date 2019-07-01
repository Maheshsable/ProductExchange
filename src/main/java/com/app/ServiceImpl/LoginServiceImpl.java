package com.app.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.DaoI.UserDaoI;
import com.app.ServiceI.LoginServiceI;

@Service
public class LoginServiceImpl implements LoginServiceI {

	@Autowired
	private UserDaoI user;
	
	public Integer loginUser(String name, String password) {
		// TODO Auto-generated method stub
		return user.loginUser(name,password);
	}

}
