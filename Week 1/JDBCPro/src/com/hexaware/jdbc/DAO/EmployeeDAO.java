package com.hexaware.jdbc.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO { //DAO class Contains all the data

	public int insertQuery(Employee emp) throws ClassNotFoundException, SQLException
	{
		Connection conn=DBUtil.getDBConnection();
		PreparedStatement prtmt=conn.prepareStatement("insert into students values(?,?,?)");
		prtmt.setInt(1, emp.getEid());
		prtmt.setString(2, emp.getName());
		prtmt.setString(3, emp.getCity());
		int a=prtmt.executeUpdate();
		return a;
	}
	
	public int updateQuery(Employee emp) throws ClassNotFoundException, SQLException
	{
		DBUtil.getDBConnection();
		Connection conn=DBUtil.getDBConnection();
		PreparedStatement prtmt=conn.prepareStatement("update students set id=? where city=?");
		prtmt.setInt(1, emp.getEid());
		prtmt.setString(2, emp.getName());
		int a=prtmt.executeUpdate();
		return a;
	}
	
	public String sortById(int id) throws ClassNotFoundException, SQLException
	{
		DBUtil.getDBConnection();
		Connection conn=DBUtil.getDBConnection();
		PreparedStatement prtmt=conn.prepareStatement("select * from students where id=?");
		prtmt.setInt(1, id);
	
		ResultSet rs=prtmt.executeQuery();
		while (rs.next())
		{
			
			int eid=rs.getInt("id");
			String name =rs.getString("name");
			String city=rs.getString("city");
			
			Employee e=new Employee(eid, name, city);
		}
		return "id"+id;
	}
	
	
	public int deleteQuery(int eid) throws ClassNotFoundException, SQLException
	{
		DBUtil.getDBConnection();
		Connection conn=DBUtil.getDBConnection();
		PreparedStatement prtmt=conn.prepareStatement("delete from students where id=?");
		prtmt.setInt(1, eid);
		int a=prtmt.executeUpdate();
		return a;
	}
	
	
	
	public List<Employee> displayData() throws ClassNotFoundException, SQLException
	{
		List<Employee> list=new ArrayList<Employee>();
		DBUtil.getDBConnection();
		Connection conn=DBUtil.getDBConnection();
		PreparedStatement prtmt=conn.prepareStatement("select * from students");
		ResultSet rs=prtmt.executeQuery();
		while ( rs.next()) {
			int eid=rs.getInt("id");
			String name =rs.getString("name");
			String city=rs.getString("city");
			
			Employee e=new Employee(eid, name, city);
			//data will be vanished so add the data in the list
			list.add(e);
			//after adding the data it will remain in list
		}
		return list;
		}
}
