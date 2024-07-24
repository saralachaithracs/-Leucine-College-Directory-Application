package com.example.college_directory.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.college_directory.model.FacultyProfile;
import com.example.college_directory.model.User;
import com.example.college_directory.repository.FacultyProfileRepository;

@Service
public class FacultyProfileService {

	@Autowired
    private FacultyProfileRepository facultyProfileRepository;

    public List<FacultyProfile> getAllFacultyProfiles() {
        return facultyProfileRepository.findAll();
    }

    public Optional<FacultyProfile> getFacultyProfileById(Long id) {
        return facultyProfileRepository.findById(id);
    }

    public FacultyProfile saveFacultyProfile(FacultyProfile facultyProfile) {
        return facultyProfileRepository.save(facultyProfile);
    }

    public void deleteFacultyProfile(Long id) {
        facultyProfileRepository.deleteById(id);
    }

	public User getUserById(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public FacultyProfile getProfileByUserId(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}


	}
