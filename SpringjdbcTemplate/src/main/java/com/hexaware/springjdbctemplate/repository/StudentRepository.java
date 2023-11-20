package com.hexaware.springjdbctemplate.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.springjdbctemplate.beans.Students;



@Repository
public class StudentRepository implements IStudentRepository{
	JdbcTemplate template;
	@Override
	public int addStudents(Students student) {
String query1="insert into students values(?,?,?,?)";
		
		int a=template.update(query1,student.getRoll(),student.getName(),student.getCity(),student.getClassn());
		System.out.println("Data Entered "+a);
		
		return a;
	}

	@Override
	public List<Students> getAllData() {
		List<Students> list= new ArrayList<Students>();
		String query2="select from students";
		template.query(query2, new MyMapper());
		return list;
	}

}
