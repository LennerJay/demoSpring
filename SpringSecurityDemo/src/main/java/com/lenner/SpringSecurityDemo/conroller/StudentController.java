package com.lenner.SpringSecurityDemo.conroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lenner.SpringSecurityDemo.model.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {
	
	List<Student> students = new ArrayList<Student>(List.of(
//			new Student(1,"test1","java1"),
//			new Student(2,"test2","java2"),
//			new Student(3,"test3","java3")
			));
	
	@GetMapping("students")
	public List<Student> getStudents(){	
		
		return students;
	};
	
	@PostMapping("students")
	public void addStudent(@RequestBody Student s){
		System.out.println("add student");
		 students.add(s);
	}
	@GetMapping("csrf-token")
	public CsrfToken getCsrfToken(HttpServletRequest req) {
		return (CsrfToken) req.getAttribute("_csrf");
	}
}
