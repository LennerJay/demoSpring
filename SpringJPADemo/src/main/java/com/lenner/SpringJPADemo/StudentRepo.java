package com.lenner.SpringJPADemo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lenner.SpringJPADemo.model.Student;


@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

//	@Query("select s from Student s where s.name = ?1") //the "1" means index in parameter and its case sensitive the "Student" table represent a class
	List<Student> findByname(String name);
	
	
	@Query("select s.marks from Student s where s.marks > ?1") // sample query which 
	List<Integer> marks(int mark);
}
