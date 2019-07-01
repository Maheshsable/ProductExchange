package com.app.DaoI;

import java.util.ArrayList;

import com.app.Entity.Admin;
import com.app.Entity.Country;

public interface AdminDaoI {

	Integer saveAdmin(Admin admin);

	ArrayList<Country> getCountry();

}
