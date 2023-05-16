package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService{

	//fake data 
	List<User> list=List.of( new User(1L,"Saurabh","988585976"),
			new User(2L,"ritik","988585979"),
			new User(3L,"Sarvesh","98858576"),
			new User(4L,"Santanu","9885976"));
	
	
	public User getuser(Long userid) {
		
		return list.stream()
				.filter( user -> user.getUserid().equals(userid)).findAny().orElse(null);
	}

}
