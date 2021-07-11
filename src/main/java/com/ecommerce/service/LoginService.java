package com.ecommerce.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public static String password ="1234";

	public boolean validateUser(String userid, String pass) {
	return userid.equalsIgnoreCase("admin") && pass.equals(LoginService.password);
	}
}
