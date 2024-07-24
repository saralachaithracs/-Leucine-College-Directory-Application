package com.example.college_directory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.college_directory.model.FacultyProfile;
import com.example.college_directory.model.User;
import com.example.college_directory.service.FacultyProfileService;

import org.springframework.ui.Model;

@Controller
public class FacultyController {
	
	@Autowired
    private FacultyProfileService facultyProfileService;

    @GetMapping("/faculty/dashboard")
    public String facultyDashboard(Model model, @RequestParam("userId") Long userId) {
        User user = facultyProfileService.getUserById(userId);
        (model).addAttribute("user", user);
        return "facultyDashboard";
    }

    @GetMapping("/faculty/profile")
    public String viewProfile(Model model, @RequestParam("userId") Long userId) {
        FacultyProfile profile = facultyProfileService.getProfileByUserId(userId);
        model.addAttribute("profile", profile);
        return "facultyProfile";
    }
}
