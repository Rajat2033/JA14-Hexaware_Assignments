package com.hexaware.springjdbctemplate.service;

import java.util.List;

import com.hexaware.springjdbctemplate.beans.Students;

public interface IStudentService {
	public int addStudents(Students student);

	public List<Students> getAllData();
}
