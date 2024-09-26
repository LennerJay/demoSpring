package com.lenner.SpringJPADemo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.lenner.SpringJPADemo.model.Student;

@SpringBootApplication
public class SpringJpaDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJpaDemoApplication.class, args);
		
		StudentRepo repo = context.getBean(StudentRepo.class);
//		Student s1 = context.getBean(Student.class);
//		s1.setRollNo(1);
//		s1.setName("test1");
//		s1.setMarks(90);
//		repo.save(s1);
//		
//		Student s2 = context.getBean(Student.class);
//		s2.setRollNo(2);
//		s2.setName("test2");
//		s2.setMarks(89);
//		repo.save(s2);
//		
//		Student s3 = context.getBean(Student.class);
//		s3.setRollNo(3);
//		s3.setName("test3");
//		s3.setMarks(66);
//		repo.save(s3);
//		Student s = (Student) repo.findByname("test1");
//		System.out.println(s.toString());
//		System.out.println("test123");
		List<Student> stud =  repo.findByname("test1");
		System.out.println(stud);
		List<Integer> marks = repo.marks(75);
		System.out.println(marks);
	}

}
