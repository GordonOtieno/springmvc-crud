package com.gordon.springmvc.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gordon.springmvc.model.Student;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

	@GetMapping
	public List<Student> getStudents() {
		return null;
	}

}
