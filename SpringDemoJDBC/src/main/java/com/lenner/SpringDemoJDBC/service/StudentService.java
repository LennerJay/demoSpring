package com.lenner.SpringDemoJDBC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lenner.SpringDemoJDBC.model.Student;
import com.lenner.SpringDemoJDBC.repo.StudentRepo;

@Service
public class StudentService {

	
	private StudentRepo repo;
	
	
	public StudentRepo getRepo() {
		return repo;
	}
	
	@Autowired
	public void setRepo(StudentRepo repo) {
		this.repo = repo;
	}




	public void addStudent(Student s) {
		repo.save(s);
	}
	
	public List<Student> getStudents(){
		
		return repo.findAll();
	}
}
