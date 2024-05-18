package com.sb.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping()
public class RedirectController {
	
	@GetMapping("/")
	public RedirectView redirect() {
		System.out.println("redirectToHome");
		return new RedirectView("/home");
	}

	@GetMapping("/admin")
	public String redirectToAdmin() {
		System.out.println("redirectToAdmin");
		return "/admin/index.html";
	}

}
