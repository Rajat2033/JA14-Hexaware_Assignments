package com.hexaware.jdbc.DAO;

import java.util.Objects;

public class Employee {//pogo class
private int eid;
private String name;
private String city;

@Override
public String toString() {
	return "id=" + eid + ", name=" + name + ", city=" + city ;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int eid, String name, String city) {
	super();
	this.eid = eid;
	this.name = name;
	this.city = city;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public int hashCode() {
	return Objects.hash(city, eid, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return Objects.equals(city, other.city) && eid == other.eid && Objects.equals(name, other.name);
}

}
