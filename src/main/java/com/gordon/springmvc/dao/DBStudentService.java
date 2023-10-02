package com.gordon.springmvc.dao;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.gordon.springmvc.model.Student;
import com.gordon.springmvc.repository.StudentRepository;
import com.gordon.springmvc.service.StudentService;

@Service
@Primary
public class DBStudentService implements StudentService {

	private final StudentRepository repository;

	public DBStudentService(StudentRepository repository) {
		this.repository = repository;
	}

	@Override
	public Student save(Student s) {
		// TODO Auto-generated method stub
		return repository.save(s);
	}

	@Override
	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Student findByEmail(String email) {
		// TODO Auto-generated method stub
		return repository.findByEmail(email);
	}

	@Override
	public Student update(Student s) {
		// TODO Auto-generated method stub
		return repository.save(s);
	}

	@Override
	public void delete(String email) {
		// TODO Auto-generated method stub
		repository.deleteByEmail(email);
	}

}
