package com.example.college_directory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.college_directory.model.AdministratorProfile;

public interface AdministratorProfileRepository extends JpaRepository<AdministratorProfile, Long> {

}
