package com.nitin.microservices2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordResetController {

	@GetMapping("/")
	public String healthCheck() {
		return "Password Reset Controller";
	}
}
