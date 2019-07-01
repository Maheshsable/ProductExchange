package com.app.controller1;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.Entity.Admin;
import com.app.Entity.Country;
import com.app.ServiceI.AdminLoginServiceI;
import com.app.ServiceI.AdminRegistrationServiceI;

@Controller
public class AdminController {

	@Autowired
	private AdminLoginServiceI service;
	@Autowired
	private AdminRegistrationServiceI adminservice;
	
	 @RequestMapping("/") 
	    public String home(){
	        return "home"; 
	    }
	
	@RequestMapping(value="/loginadmin",method=RequestMethod.GET)
	public String loginAdminRequest() {
      return "logiadminrequest";		
	}
	
	@RequestMapping(value="/adminloginrequest",method=RequestMethod.GET)
	public String loginAdmin(@RequestParam("name") String name, @RequestParam("password") String password ) {
		
		return "adminlogin";
	}
	
	@RequestMapping(value="/adminregistration")
	public String adminRegistration() {
		return "admin_registration";
	}
	
	@RequestMapping(value="/adminregistrationrequest",method=RequestMethod.POST)
	public String adminRegistrationRequest(@ModelAttribute  Admin admin,HttpServletRequest request,HttpServletResponse response) {
		
		Integer id=adminservice.saveAdmin(admin);
		return "";
	}
	
	@RequestMapping(value="/getCountry",method=RequestMethod.GET)
	@ResponseBody
	public  List<Country>  getCountry() {
		ArrayList<Country> al=adminservice.getCountry();
		return al;
	}
	
}
