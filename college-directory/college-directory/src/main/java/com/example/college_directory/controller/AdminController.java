package com.example.college_directory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.ui.Model;

@Controller
public class AdminController {

    @Autowired
    private AdministratorProfileService adminProfileService;

    @GetMapping("/admin/dashboard")
    public String adminDashboard(Model model, @RequestParam("userId") Long userId) {
        (model).addAttribute("userId", userId);
        return "adminDashboard";
    }

    @GetMapping("/admin/students")
    public String manageStudents() {
        return "manageStudents";
    }

    @GetMapping("/admin/faculty")
    public String manageFaculty() {
        return "manageFaculty";
    }

    @GetMapping("/admin/courses")
    public String manageCourses() {
        return "manageCourses";
    }

}
