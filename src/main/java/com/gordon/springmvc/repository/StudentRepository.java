package com.gordon.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gordon.springmvc.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	Student findByEmail(String email);

	void deleteByEmail(String email);
}
