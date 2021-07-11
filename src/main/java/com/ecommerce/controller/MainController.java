package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.service.LoginService;

@Controller
public class MainController {
	
	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/index")
	public String home() {
		return "index";
	}
	
	
	@RequestMapping(value= "/dashboard")
	public String dashboard() {
		return "dashboard";
	}
	@RequestMapping(value= "/changepassword")
	public String changepassword() {
		return "changepassword";
	}
	
	@Autowired
	LoginService service;
	
	@RequestMapping(value= "/login", method = RequestMethod.POST )
	public String login(ModelMap model, @RequestParam String userid, @RequestParam String pass) {
		/*
		 * if(userid.equalsIgnoreCase("admin") && pass.equals("1234")) { dashboard();
		 * }else { index(); }
		 */
		boolean isvalidUser = service.validateUser(userid, pass);
		if(!isvalidUser) {
			model.put("errorMessage", "Invalid Credential");
			return "index";
		}
		model.put("userid", userid);
		model.put("pass", pass);
		return "dashboard";
		
	}
	@RequestMapping(value= "/cpassword", method = RequestMethod.POST )
	public String cpassword(ModelMap model, @RequestParam String password) {
		if(password.equals("")) {
		
		model.put("errorMessage", "Please Enter password");
		return "changepassword";
		}
		LoginService.password=password;
		model.put("errorMessage", "Password Changed! Please Login Again");
		return "index";
	}
	
	@RequestMapping(value= "/logout")
	public String logout() {
		return "logout";
	}
}
