package com.bb.RideConnect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bb.RideConnect.data.User;
import com.bb.RideConnect.repository.UserRepository;

@RestController
public class RegisterationController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/register")
	public User registerUser(@RequestBody User user)
	{
		return userRepository.save(user);
	}

}
