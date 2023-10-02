package com.gordon.springmvc.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gordon.springmvc.model.Student;
import com.gordon.springmvc.service.StudentService;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

	private final StudentService service;

	public StudentController(StudentService service) {
		this.service = service;
	}

	@PostMapping
	public Student save(@RequestBody Student student) {
		return service.save(student);
	}

	@GetMapping("{email}")
	public Student findByEmail(@PathVariable String email) {
		return service.findByEmail(email);
	}

	@GetMapping
	public List<Student> getStudents() {
		return service.findAllStudents();
	}

	@PutMapping
	public Student updateStudent(@RequestBody Student student) {
		return service.update(student);
	}

	@DeleteMapping("{email}")
	public void deleteStudent(@PathVariable("email") String email) {
		service.delete(email);
	}

}
