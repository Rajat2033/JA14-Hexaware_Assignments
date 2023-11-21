package com.hexaware.jdbctemplate.DAO;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.hexaware.jdbctemplate.beans.Product;

public class ProductDao implements IProductDAO {

	JdbcTemplate template;
	@Override
	public int insertQuery(Product p) {
		String query="insert into product_table valuees(?,?,?)";
		int count =template.update(query,p.getPid(),p.getPname(),p.getPamount());
		return count;
	}

	@Override
	public int updateQuery(Product p) {
		String query="update product_table set pname=? where pid=?";
		int count=template.update(query,p.getPname(),p.getPid());
		return count;
	}

	@Override
	public int deleteQuery(int pid) {
		String query="delete from product_table where pid=?";
		int count=template.update(query,pid);
		return count;
		
	}

	@Override
	public List<Product> getAllData() {
		String getdata="select * from product_table";
		List<Product> list=template.query(getdata, new ProductMapper());
		return list;
		
	}

}
