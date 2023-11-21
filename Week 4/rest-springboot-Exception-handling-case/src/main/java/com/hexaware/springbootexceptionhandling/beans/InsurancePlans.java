
package com.hexaware.springbootexceptionhandling.beans;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="InsurancePlan_Data")
public class InsurancePlans implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int planId;
	@NotNull
	private String planName;
	private String planType;
	@Min(250000)
	@Max(900000)
	
	private double planCoverAmount;
	private double planEmi;
	private String planDetails;
	public InsurancePlans() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InsurancePlans(int planId, String planName, String planType, double planCoverAmount, double planEmi,
			String planDetails) {
		super();
		this.planId = planId;
		this.planName = planName;
		this.planType = planType;
		this.planCoverAmount = planCoverAmount;
		this.planEmi = planEmi;
		this.planDetails = planDetails;
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
	public String getPlanType() {
		return planType;
	}
	public void setPlanType(String planType) {
		this.planType = planType;
	}
	public double getPlanCoverAmount() {
		return planCoverAmount;
	}
	public void setPlanCoverAmount(double planCoverAmount) {
		this.planCoverAmount = planCoverAmount;
	}
	public double getPlanEmi() {
		return planEmi;
	}
	public void setPlanEmi(double planEmi) {
		this.planEmi = planEmi;
	}
	public String getPlanDetails() {
		return planDetails;
	}
	public void setPlanDetails(String planDetails) {
		this.planDetails = planDetails;
	}
	@Override
	public int hashCode() {
		return Objects.hash(planCoverAmount, planDetails, planEmi, planId, planName, planType);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InsurancePlans other = (InsurancePlans) obj;
		return Double.doubleToLongBits(planCoverAmount) == Double.doubleToLongBits(other.planCoverAmount)
				&& Objects.equals(planDetails, other.planDetails)
				&& Double.doubleToLongBits(planEmi) == Double.doubleToLongBits(other.planEmi) && planId == other.planId
				&& Objects.equals(planName, other.planName) && Objects.equals(planType, other.planType);
	}
	
	
}
