package com.example.college_directory.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class FacultyProfile {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String photo;
	    private String officeHours;

	    @OneToOne
	    private User user;

	    @OneToOne
	    private Department department;
}
