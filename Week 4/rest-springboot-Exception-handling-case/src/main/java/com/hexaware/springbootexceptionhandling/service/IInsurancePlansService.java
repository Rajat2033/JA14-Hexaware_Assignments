package com.hexaware.springbootexceptionhandling.service;

import java.util.List;

import com.hexaware.springbootexceptionhandling.beans.InsurancePlans;

public interface IInsurancePlansService {

	public InsurancePlans addInsurancePlan(InsurancePlans plans);

	public InsurancePlans updateInsurancePlans(InsurancePlans plans);

	public void deleteInsurancePlan(int planId);

	public InsurancePlans getPlanByName(String planName);

	public List<InsurancePlans> getAllPlans();

	public List<InsurancePlans> getSortedByCoverAmount();

	public List<InsurancePlans> getInsurancePlansSorted(double planCoverAmount);

}
