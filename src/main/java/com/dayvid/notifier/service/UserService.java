package com.dayvid.notifier.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dayvid.notifier.dto.UserDTO;
import com.dayvid.notifier.model.User;
import com.dayvid.notifier.repository.UserRepository;
import com.dayvid.notifier.service.exception.UserNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;

//	@Transactional
	public UserDTO save(UserDTO userData) {
		var user = new User(userData);
		repository.save(user);
		
		return userData;
	}
	
	public User searchById(Long id) {
		var user = repository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found"));
		return user;
	}
	
}
