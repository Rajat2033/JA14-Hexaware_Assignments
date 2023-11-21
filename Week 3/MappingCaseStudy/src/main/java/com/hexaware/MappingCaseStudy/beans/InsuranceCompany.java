package com.hexaware.MappingCaseStudy.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class InsuranceCompany {
	
	@Id
	private int companyId;
	private String copanyName;
	
	
	@OneToMany(mappedBy = "companies",cascade = CascadeType.ALL)
	
	private Set<InsurancePlans> plan=new HashSet<InsurancePlans>();


	public InsuranceCompany() {
		super();
		// TODO Auto-generated constructor stub
	}


	public InsuranceCompany(int companyId, String copanyName, Set<InsurancePlans> plan) {
		super();
		this.companyId = companyId;
		this.copanyName = copanyName;
		this.plan = plan;
	}


	public int getCompanyId() {
		return companyId;
	}


	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}


	public String getCopanyName() {
		return copanyName;
	}


	public void setCopanyName(String copanyName) {
		this.copanyName = copanyName;
	}


	public Set<InsurancePlans> getPlan() {
		return plan;
	}


	public void setPlan(Set<InsurancePlans> plan) {
		this.plan = plan;
	}
	
	public void addplans(InsurancePlans plans) {

		 
				plans.setCompanies(this); // in main() dept.addEmployee(e1);

				Set<InsurancePlans> set = getPlan();

				set.add(plans);
	}
	
	
	

}
