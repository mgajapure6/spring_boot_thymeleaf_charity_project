package com.sb.thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@GetMapping()
	public String redirect() {
		System.out.println("redirect");
		return "login/login.html";
	}
	

}
