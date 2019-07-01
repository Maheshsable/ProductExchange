package com.app.DaoImpl;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.DaoI.AdminDaoI;
import com.app.Entity.Admin;
import com.app.Entity.Country;
@Repository
public class AdminDaoImpl implements AdminDaoI{

	@Autowired(required=true)
	private SessionFactory sessionfactory;

	
	public SessionFactory getTemplate() {
		return sessionfactory;
	}


	public void setTemplate(SessionFactory template) {
		this.sessionfactory = template;
	}
	
	public Integer saveAdmin(Admin admin) {
		Session session=sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
		Integer id=(Integer)session.save(admin);
		return id;
	}


	public ArrayList<Country> getCountry() {
		// TODO Auto-generated method stub
		
		Session session=sessionfactory.openSession();
		
		//Create the transaction object
		Transaction tx=session.beginTransaction();
		
		String query="from Country";
		
		Query query1=session.createQuery(query);
		
		ArrayList list=(ArrayList) query1.list();
		
		
		return list;
	}

}
