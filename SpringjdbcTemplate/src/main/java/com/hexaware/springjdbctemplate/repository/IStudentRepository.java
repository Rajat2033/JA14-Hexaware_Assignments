package com.hexaware.springjdbctemplate.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hexaware.springjdbctemplate.beans.Students;


public interface IStudentRepository {
	
	public int addStudents(Students student);
	
	public List<Students> getAllData();

}
