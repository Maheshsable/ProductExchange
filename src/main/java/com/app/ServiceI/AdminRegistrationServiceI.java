package com.app.ServiceI;

import java.util.ArrayList;

import com.app.Entity.Admin;
import com.app.Entity.Country;

public interface AdminRegistrationServiceI {

	Integer saveAdmin(Admin admin);

	ArrayList<Country> getCountry();




}
