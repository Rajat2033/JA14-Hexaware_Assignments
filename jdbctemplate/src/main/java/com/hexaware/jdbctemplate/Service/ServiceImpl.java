package com.hexaware.jdbctemplate.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.jdbctemplate.DAO.IProductDAO;
import com.hexaware.jdbctemplate.beans.Product;
@Service
public class ServiceImpl implements IProductService {

	@Autowired
	IProductDAO dao;
	@Override
	public int insertQuery(Product p) {
		// TODO Auto-generated method stub
		return dao.insertQuery(p);
	}

	@Override
	public int updateQuery(Product p) {
		// TODO Auto-generated method stub
		return dao.updateQuery(p);
	}

	@Override
	public int deleteQuery(int pid) {
		// TODO Auto-generated method stub
		return dao.deleteQuery(pid);
	}

	@Override
	public List<Product> getAllData() {
		// TODO Auto-generated method stub
		return dao.getAllData();
	}

}
