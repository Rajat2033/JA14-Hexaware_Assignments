package com.hexaware.MappingHibernate.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="product_master")
public class Product {
	@Id
	private int product_id;
	private String product_name;
	private String origin;
	
	@ManyToMany(mappedBy = "products",fetch = FetchType.LAZY)
	
	private Set<Order> orders=new HashSet<Order>();
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Set<Order> getOrder() {
		return orders;
	}

	public void setOrder(Set<Order> orders) {
		this.orders = orders;
	}

	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	

}
