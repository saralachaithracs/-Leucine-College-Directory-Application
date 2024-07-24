package com.example.college_directory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.college_directory.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
	
}
