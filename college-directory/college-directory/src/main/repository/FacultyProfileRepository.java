package com.example.college_directory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.college_directory.model.FacultyProfile;

public interface FacultyProfileRepository extends JpaRepository<FacultyProfile, Long> {

}
