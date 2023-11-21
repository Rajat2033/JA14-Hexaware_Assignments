package com.hexaware.MappingCaseStudy.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class InsurancePlans {
	
	@Id
	private int planId;
	private String planName;
	private String plantype;
	
	@ManyToOne
	@JoinColumn(name = "cno")
	InsuranceCompany companies;

	public InsurancePlans() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InsurancePlans(int planId, String planName, String plantype, InsuranceCompany companies) {
		super();
		this.planId = planId;
		this.planName = planName;
		this.plantype = plantype;
		this.companies = companies;
	}

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlantype() {
		return plantype;
	}

	public void setPlantype(String plantype) {
		this.plantype = plantype;
	}

	public InsuranceCompany getCompanies() {
		return companies;
	}

	public void setCompanies(InsuranceCompany companies) {
		this.companies = companies;
	}

	
	
	
	
	

}
