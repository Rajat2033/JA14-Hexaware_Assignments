package com.hexaware.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/javajdbc";
		String uname="root";
		String pass="abc123";
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		
		Connection con=DriverManager.getConnection(url, uname, pass);
		
		
		Statement s=con.createStatement();
		
		
//		String query="insert into students values(2,'kanchan','Nagpur')";
//		String query="Update students set name='Kanchan Darvhekar' where id=2";
//		String query1="insert into students values(3,'Ruchi ','Pune')";
//		String query ="delete from students where id=3";
		String query= "Select * from students";
//		int a = s.executeUpdate(query);
		
		//for fetching Data
		ResultSet a=s.executeQuery(query);
		while (a.next())
		{
		System.out.println("Query given result  ");
		
		System.out.print("Eid : "+a.getInt("id"));
		System.out.print(" Name : "+a.getString("name"));
		System.out.println(" City : "+a.getString("city"));
		}
		
		con.close();
		
		
		
		
		
		
	}

}
