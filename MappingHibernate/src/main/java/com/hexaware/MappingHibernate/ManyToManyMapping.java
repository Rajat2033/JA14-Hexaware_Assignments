package com.hexaware.MappingHibernate;

import java.time.LocalDate;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.MappingHibernate.beans.Order;
import com.hexaware.MappingHibernate.beans.Product;

public class ManyToManyMapping {

	public static void main(String[] args) {
	SessionFactory sessionfac=HibernateUtil.getSessionFactory();
		Session session=sessionfac.openSession();
		Transaction tr= session.beginTransaction();
		
		Product product1=new Product();
		product1.setProduct_id(101);
		product1.setProduct_name("Puma Shoes");
		product1.setOrigin("India");
		
		Product product2=new Product();
		product2.setProduct_id(102);
		product2.setProduct_name("Adidas Shoes");
		product2.setOrigin("Europe");
		
		Product product3=new Product();
		product3.setProduct_id(103);
		product3.setProduct_name("campus Shoes");
		product3.setOrigin("America");
		
		Order order1=new Order();
		order1.setOrder_id(1);
		order1.setOrder_Date(new Date());
		order1.addProduct(product1);
		order1.addProduct(product3);
		
		Order order2=new Order();
		order2.setOrder_id(2);
		order2.setOrder_Date(new Date());
		order2.addProduct(product2);
		order2.addProduct(product3);
		
		
		
		
		
		
		
		session.persist(order1);
		session.persist(order2);
		tr.commit();
		sessionfac.close();
		}

}
