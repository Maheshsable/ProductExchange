package com.app.DaoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.app.DaoI.UserDaoI;
import com.app.Entity.User;

@Repository
public class UserDaoImpl implements UserDaoI{

	private SessionFactory factory;
	
	public Integer loginUser(String name, String password) {

		
		return null;
	}

	public Integer saveUser(User user) {

		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Integer id=(Integer)session.save(user);
		return id;
	}

}
