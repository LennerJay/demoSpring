package com.lenner.SpringSecurityDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.lenner.SpringSecurityDemo.dao.UserRepo;
import com.lenner.SpringSecurityDemo.model.User;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	public User saveUser(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		System.out.println(user.getPassword());
		return userRepo.save(user);
	}
	
	public List<User> getAllUsers(){
		return userRepo.getAllUsers();
	}

	
	
}
