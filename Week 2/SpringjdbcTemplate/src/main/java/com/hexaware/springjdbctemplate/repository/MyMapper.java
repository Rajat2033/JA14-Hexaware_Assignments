package com.hexaware.springjdbctemplate.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hexaware.springjdbctemplate.beans.Students;

public class MyMapper implements RowMapper<Students> {

	@Override
	public Students mapRow(ResultSet rs, int rowNum) throws SQLException {
		Students s=new Students();
		s.setRoll(rs.getInt("roll"));
		s.setName(rs.getString("name"));
		s.setClassn(rs.getInt("classn"));
		s.setCity(rs.getString("city"));
		return s;
	}
	
	

}
