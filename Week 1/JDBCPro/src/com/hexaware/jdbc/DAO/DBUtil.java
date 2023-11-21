package com.hexaware.jdbc.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Design Pattern

public class DBUtil { ///Factory Class
	
	public static Connection getDBConnection() throws ClassNotFoundException, SQLException
	//Factory Method
	{
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/javajdbc";
		String uname="root";
		String pass="abc123";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	    conn=DriverManager.getConnection(url, uname, pass);
		return conn;
		
	}

}
