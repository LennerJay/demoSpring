package com.lenner.SpringSecurityDemo.conroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HomeController {

	@GetMapping("hello")
	public String greet(HttpServletRequest request) {
		return "Hello World ";
	}
	
}
