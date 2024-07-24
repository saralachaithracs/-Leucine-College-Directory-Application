package com.example.college_directory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.college_directory.model.StudentProfile;

public interface StudentProfileRepository extends JpaRepository<StudentProfile, Long>{
	
}
