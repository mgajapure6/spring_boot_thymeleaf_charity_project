package com.sb.thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contact-us")
public class ContactUsController {
	
	@GetMapping()
	public String redirect() {
		return "contact_us/contact_us.html";
	}

}
