package com.hexaware.MappingHibernate.beans;

import java.util.Date;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="order_master")
public class Order {
	@Id
	private int order_id;
	@Temporal(TemporalType.DATE)
	private Date order_Date;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Product_Orders", joinColumns = { @JoinColumn(name = "order_id") },
	inverseJoinColumns = {@JoinColumn(name = "product_id") })
	private Set<Product> products = new HashSet<Product>();

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public Date getOrder_Date() {
		return order_Date;
	}

	public void setOrder_Date(Date order_Date) {
		this.order_Date = order_Date;
	}

	public Set<Product> getProduct() {
		return products;
	}

	public void setProduct(Set<Product> products) {
		this.products = products;
	}
	public void addProduct(Product products)
	{
		this.getProduct().add(products);
	}

	
}
