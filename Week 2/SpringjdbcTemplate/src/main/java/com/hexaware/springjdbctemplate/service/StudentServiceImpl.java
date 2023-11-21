package com.hexaware.springjdbctemplate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springjdbctemplate.beans.Students;
import com.hexaware.springjdbctemplate.repository.IStudentRepository;
@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	IStudentRepository repo;
	@Override
	public int addStudents(Students student) {
		// TODO Auto-generated method stub
		return repo.addStudents(student);
	}

	@Override
	public List<Students> getAllData() {
		// TODO Auto-generated method stub
		return repo.getAllData();
	}

}
