package com.hexaware.jdbctemplate.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hexaware.jdbctemplate.beans.Product;

public class ProductMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product p=new Product();
		p.setPid(rs.getInt("pid"));
		p.setPname(rs.getString("pname"));
		p.setPamount(rs.getDouble("pamount"));
		return p;
	}

}
