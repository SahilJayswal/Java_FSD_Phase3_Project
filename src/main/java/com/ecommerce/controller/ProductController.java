package com.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	
	@RequestMapping(value= "/manage")
	public String home() {
		return "manage";
	}
	
}
