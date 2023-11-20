package com.hexaware.LayeredArch.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.LayeredArch.DAO.IEmployeeDAO;
import com.hexaware.LayeredArch.beans.Employee;

@Service("EmployeeService")
public class EmployeeService implements IEmployeeService {
	@Autowired
	IEmployeeDAO dao;

	@Override
	public Employee getData() {
		// We call DAO methods
		//Business Logic and input validations
		return dao.getData();
	}

}
