package com.gordon.springmvc.service;

import java.util.List;

import com.gordon.springmvc.model.Student;

public interface StudentService {
	Student save(Student s);

	List<Student> findAllStudents();

	Student findByEmail(String email);

	Student update(Student s);

	void delete(String email);
}
