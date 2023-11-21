package com.hexaware.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	
	public static Connection getDBConnection() throws ClassNotFoundException, SQLException
	{
		String url="jdbc:mysql://localhost:3306/demopro";
		String uname="root";
		String pass="abc123";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn= DriverManager.getConnection(url,uname,pass);
//		
//		Statement s=conn.createStatement();
//		
//		String query= "insert into patients values(2,'Vijay Muley','diabetes','Nagpur')";
//		
//		int a = s.executeUpdate(query);
//		if(a>0)
//		{
//		System.out.println("Data Inserted");
//		}
//		else
//		{
//			System.out.println("Data Not Inserted");
//		}
	
		return conn;
		
	}

}
