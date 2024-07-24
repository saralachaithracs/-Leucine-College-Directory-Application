package com.example.college_directory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.college_directory.model.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long>{

}
