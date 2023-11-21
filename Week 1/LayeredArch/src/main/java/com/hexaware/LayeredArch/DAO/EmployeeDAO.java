package com.hexaware.LayeredArch.DAO;

import org.springframework.stereotype.Repository;

import com.hexaware.LayeredArch.beans.Employee;

@Repository("EmployeeDao")
public class EmployeeDAO implements IEmployeeDAO {

	@Override
	public Employee getData() {
		// Any DB Connectivity logic like jdbc , hibernate , JPA
		return new Employee(101,"Rajat",20000);
	}

}
