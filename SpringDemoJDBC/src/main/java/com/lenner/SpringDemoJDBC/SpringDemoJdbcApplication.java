package com.lenner.SpringDemoJDBC;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.lenner.SpringDemoJDBC.model.Student;
import com.lenner.SpringDemoJDBC.service.StudentService;

@SpringBootApplication
public class SpringDemoJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringDemoJdbcApplication.class, args);
		
		Student stud = context.getBean(Student.class);
			stud.setId(10);
			stud.setMarks(90);
			stud.setName("testtest");

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(stud);

		List<Student> students = service.getStudents();
		System.out.println(students);

	}

}
