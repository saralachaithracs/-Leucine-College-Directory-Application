package com.example.college_directory.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.college_directory.model.StudentProfile;
import com.example.college_directory.model.User;
import com.example.college_directory.repository.StudentProfileRepository;

@Service
public class StudentProfileService {

	@Autowired
    private StudentProfileRepository studentProfileRepository;

    public List<StudentProfile> getAllStudentProfiles() {
        return studentProfileRepository.findAll();
    }

    public Optional<StudentProfile> getStudentProfileById(Long id) {
        return studentProfileRepository.findById(id);
    }

    public StudentProfile saveStudentProfile(StudentProfile studentProfile) {
        return studentProfileRepository.save(studentProfile);
    }

    public void deleteStudentProfile(Long id) {
        studentProfileRepository.deleteById(id);
    }

	public User getUserById(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public StudentProfile getProfileByUserId(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}
}
