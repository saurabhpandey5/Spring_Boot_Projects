package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.User;
import com.user.service.UserService;

@RestController
@RequestMapping("/user")
public class Usercontroller {
	
	@Autowired
	private UserService userservice;
	
	@GetMapping("/{userid}")
	public User getuser(@PathVariable("userid")Long userid) {
		return this.userservice.getuser(userid);
	}
}
