package com.lenner.SpringSecurityDemo.conroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lenner.SpringSecurityDemo.model.User;
import com.lenner.SpringSecurityDemo.service.JwtTokenService;
import com.lenner.SpringSecurityDemo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@Autowired
	private JwtTokenService jwtTokenService;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	@PostMapping("register")
	public User register(@RequestBody User user) {
		System.out.println(user.toString());

		return service.saveUser(user);
	}
	
	
	@GetMapping("users")
	public List<User> users(){
		
		return service.getAllUsers();
	}
	
	
	@PostMapping("login")
	public String Login(@RequestBody User user) {
		Authentication authentication = authenticationManager.
										authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword()));
		
		
		if(authentication.isAuthenticated()) {
			return jwtTokenService.generateToken(user.getUsername());
		}
		else {
			 System.out.println("failed");
			 return "failed";
		}
		
	}
}
