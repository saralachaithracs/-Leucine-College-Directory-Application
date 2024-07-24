package com.example.college_directory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.college_directory.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);
}
