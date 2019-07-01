package com.app.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.DaoI.UserDaoI;
import com.app.Entity.User;
import com.app.ServiceI.UserRegistrationServiceI;
@Service
public class UserRegistrationServiceImpl implements UserRegistrationServiceI {
   
	@Autowired
	private UserDaoI userDao;
	public Integer saveUser(User user) {
		// TODO Auto-generated method stub
		return userDao.saveUser(user);
	}

}
