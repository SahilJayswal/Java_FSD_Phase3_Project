package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.entity.User;
import com.ecommerce.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	UserRepository userRepository;
    
    @RequestMapping(value = "/user", method = RequestMethod.GET)
	public String listUsers(Model map) {
		List<User> list = userRepository.findAll();
		map.addAttribute("list", list);
		return "userlist";
	}
    
    @RequestMapping(value = "/cust", method = RequestMethod.POST)
    public String searchUsers(Model map, @RequestParam String search) {
    	List<User> list = userRepository.findbyname(search);
    	map.addAttribute("list", list);
		return "userlist";
    }

	/*
	 * @RequestMapping(value = "/user") public List<User> getUsers() { return
	 * (List<User>) userRepository.findAll(); }
	 */

}
