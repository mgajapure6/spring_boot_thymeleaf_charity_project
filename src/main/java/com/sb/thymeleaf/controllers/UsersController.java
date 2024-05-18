package com.sb.thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UsersController {
	
	@GetMapping()
	public String redirect() {
		System.out.println("redirect");
		return "user/index.html";
	}
	

}
