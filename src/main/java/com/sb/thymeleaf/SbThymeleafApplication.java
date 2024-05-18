package com.sb.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SbThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbThymeleafApplication.class, args);
	}

}
