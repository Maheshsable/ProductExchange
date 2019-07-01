package com.app.controller1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.Entity.User;
import com.app.ServiceI.LoginServiceI;
import com.app.ServiceI.UserRegistrationServiceI;
@Controller
public class UserController {

	@Autowired
	private LoginServiceI loginService;
	@Autowired
	private UserRegistrationServiceI registrationService;
	
	 @RequestMapping("/") 
	    public String home(){
	        return "home"; 
	    }
	
	@RequestMapping(value="/userlogin",method=RequestMethod.GET)
	public String loginUserRequest() {
      return "loginuser";		
	}
	
	@RequestMapping(value="/userlogin",method=RequestMethod.GET)
	public String loginUser(@RequestParam("name") String name,@RequestParam("password") String password) {
		
		Integer id=loginService.loginUser(name,password);
		return "";
	}
	
	@RequestMapping(value="/loginuserrequest",method=RequestMethod.GET)
	public String registerUserRequest() {
		return "registraion";	
	}
	
	public String registerUser(@ModelAttribute User user) {
		Integer id=registrationService.saveUser(user);
		return "";
	}
}
