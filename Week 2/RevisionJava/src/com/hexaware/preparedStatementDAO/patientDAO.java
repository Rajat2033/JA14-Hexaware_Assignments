package com.hexaware.preparedStatementDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hexaware.preparedStatement.DBUtil;
import com.hexaware.preparedStatement.Patients;

public class patientDAO {

	public int insertQuery(Patients p) throws SQLException, ClassNotFoundException {
		Connection conn = DBUtil.getDBConnection();

		PreparedStatement prtmt = conn.prepareStatement("insert into patients values(?,?,?,?)");

		prtmt.setInt(1, p.getPid());
		prtmt.setString(2, p.getPname());
		prtmt.setString(3, p.getPdisease());
		prtmt.setString(4, p.getPcity());
		int a = prtmt.executeUpdate();
		return a;
	}
	
	public int deleteData(int id) throws SQLException, ClassNotFoundException
	{
		Connection conn=DBUtil.getDBConnection();
		PreparedStatement prtmt=conn.prepareStatement("delete from patients where id=?");
		
		prtmt.setInt(1, id);
		int a=prtmt.executeUpdate();
		return a;
	}

	public List<Patients> displayAllData() throws SQLException, ClassNotFoundException {

		List<Patients> list = new ArrayList<Patients>();

		Connection conn = DBUtil.getDBConnection();

		PreparedStatement prtmt = conn.prepareStatement("select * from patients");

		ResultSet rs = prtmt.executeQuery();

		while (rs.next()) {
			int pid = rs.getInt("id");
			String pname = rs.getString("name");
			String disease = rs.getString("disease");
			String city = rs.getString("city");

			Patients p = new Patients(pid, pname, disease, city);
			list.add(p);
		}

		return list;

	}

}
