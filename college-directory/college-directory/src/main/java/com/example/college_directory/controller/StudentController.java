package com.example.college_directory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.college_directory.model.StudentProfile;
import com.example.college_directory.model.User;
import com.example.college_directory.service.StudentProfileService;

import org.springframework.ui.Model;

@Controller
public class StudentController {

	@Autowired
    private StudentProfileService studentProfileService;

    @GetMapping("/student/dashboard")
    public String studentDashboard(Model model, @RequestParam("userId") Long userId) {
        User user = studentProfileService.getUserById(userId);
        (model).addAttribute("user", user);
        return "studentDashboard";
    }

    @GetMapping("/student/profile")
    public String viewProfile(Model model, @RequestParam("userId") Long userId) {
        StudentProfile profile = studentProfileService.getProfileByUserId(userId);
        model.addAttribute("profile", profile);
        return "studentProfile";
    }
}
