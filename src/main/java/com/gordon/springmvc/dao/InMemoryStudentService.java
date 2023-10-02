package com.gordon.springmvc.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gordon.springmvc.model.Student;
import com.gordon.springmvc.service.StudentService;

@Service
public class InMemoryStudentService implements StudentService {
	private final InMemoryStudentDao dao;

	public InMemoryStudentService(InMemoryStudentDao dao) {
		this.dao = dao;
	}

	@Override
	public Student save(Student s) {
		// TODO Auto-generated method stub
		return dao.save(s);
	}

	@Override
	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
		return dao.findAllStudents();
	}

	@Override
	public Student findByEmail(String email) {
		// TODO Auto-generated method stub
		return dao.findByEmail(email);
	}

	@Override
	public Student update(Student s) {
		// TODO Auto-generated method stub
		return dao.update(s);
	}

	@Override
	public void delete(String email) {
		// TODO Auto-generated method stub
		dao.delete(email);
	}

}
