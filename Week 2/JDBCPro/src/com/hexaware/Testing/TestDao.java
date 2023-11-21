package com.hexaware.Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.hexaware.jdbc.DAO.Employee;
import com.hexaware.jdbc.DAO.EmployeeDAO;

class TestDao {

	static EmployeeDAO daoEmployeeDAO;

	@BeforeAll
	public static void getObj() {
		daoEmployeeDAO = new EmployeeDAO();
		System.out.println("Hello"+daoEmployeeDAO);
	}

	@Test
	
	void testInsertQuery() throws ClassNotFoundException, SQLException  {
		Employee emp=new Employee(110, "Rajat", "Nagpur");
		int actual= daoEmployeeDAO.insertQuery(emp);
		System.out.println(actual);
		assertEquals(1, actual);
	}

	@Test
	@Disabled
	void testDisplayData() throws ClassNotFoundException, SQLException {
		List<Employee> e=daoEmployeeDAO.displayData();
		ResultSet s	;
//		assertEquals(s, e);
		
		
		

	}

}
