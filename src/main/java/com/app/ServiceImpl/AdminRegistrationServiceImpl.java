package com.app.ServiceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.DaoI.AdminDaoI;
import com.app.Entity.Admin;
import com.app.Entity.Country;
import com.app.ServiceI.AdminRegistrationServiceI;

@Service
public class AdminRegistrationServiceImpl implements AdminRegistrationServiceI{

	@Autowired
	private AdminDaoI admindaoi;
	
	public Integer saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return admindaoi.saveAdmin(admin);
	}

	public ArrayList<Country> getCountry() {
		
		return admindaoi.getCountry();
	}

	
	
}
