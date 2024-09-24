package com.lenner.SpringDemoJDBC.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.lenner.SpringDemoJDBC.model.Student;

@Repository
public class StudentRepo {

	JdbcTemplate jdbc;
	

	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	@Autowired
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}


	public void save(Student s) {
		String query = "insert into Student(id,name,marks) Values (?,?,?)";
		int res = this.jdbc.update(query, s.getId(),s.getName(),s.getMarks());
		System.out.println("affected table: " + res);
	}


	public List<Student> findAll() {
		String query = "select * from Student";
			
	
		return jdbc.query(query, (ResultSet rs, int arg1)->{
			Student s = new Student();
			s.setId(rs.getInt("id"));
			s.setName(rs.getString("name"));
			s.setMarks(rs.getInt("marks"));
			return s;
		});
	}
}
