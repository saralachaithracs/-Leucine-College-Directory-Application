package com.example.college_directory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.college_directory.model.User;
import com.example.college_directory.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
    private UserRepository userRepository;

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

	public void saveUser(User user) {
		// TODO Auto-generated method stub
		
	}



}
