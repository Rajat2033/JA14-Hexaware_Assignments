package com.hexaware.hibernateApp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.springframework.stereotype.Component;


@Entity
@Component
@NamedQueries({
	@NamedQuery(name = "getDocRecord", query = "select d from Doctors d")})
public class Doctors {
	
	@Id
	private int doctid;
	private String doctName;
	private String speciality;
	private int doctexp;
	public Doctors() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctors(int doctid, String doctName, String speciality, int doctexp) {
		super();
		this.doctid = doctid;
		this.doctName = doctName;
		this.speciality = speciality;
		this.doctexp = doctexp;
	}
	public int getDoctid() {
		return doctid;
	}
	public void setDoctid(int doctid) {
		this.doctid = doctid;
	}
	public String getDoctName() {
		return doctName;
	}
	public void setDoctName(String doctName) {
		this.doctName = doctName;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public int getDoctexp() {
		return doctexp;
	}
	public void setDoctexp(int doctexp) {
		this.doctexp = doctexp;
	}
	@Override
	public String toString() {
		return "Doctors [doctid=" + doctid + ", doctName=" + doctName + ", speciality=" + speciality + ", doctexp="
				+ doctexp + "]";
	}
	
	

}
