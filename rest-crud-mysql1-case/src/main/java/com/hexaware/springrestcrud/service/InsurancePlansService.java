package com.hexaware.springrestcrud.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.hexaware.springrestcrud.entities.InsurancePlans;
import com.hexaware.springrestcrud.repository.InsurancePlansRepository;

@Service
public class InsurancePlansService implements IInsurancePlansService {

	@Autowired
	InsurancePlansRepository repo;

	@Override
	public InsurancePlans addInsurancePlan(InsurancePlans plans) {
		// TODO Auto-generated method stub
		return repo.save(plans);
	}

	@Override
	public InsurancePlans updateInsurancePlans(InsurancePlans plans) {
		// TODO Auto-generated method stub
		return repo.save(plans);
	}

	@Override
	public void deleteInsurancePlan(int planId) {
		// TODO Auto-generated method stub
		repo.deleteById(planId);
		
	}

	@Override
	public InsurancePlans getPlanByName(String planName) {
		// TODO Auto-generated method stub
		return repo.findByPlanName(planName);
	}

	@Override
	public List<InsurancePlans> getAllPlans() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<InsurancePlans> getSortedByCoverAmount() {
		// TODO Auto-generated method stub
		return repo.findAll(Sort.by("planCoverAmount"));
	}

	@Override
	public List<InsurancePlans> getInsurancePlansSorted(double planCoverAmount) {
		// TODO Auto-generated method stub
		return repo.getInsurancePlansSorted(planCoverAmount);
	}

	public static boolean inputValidation(InsurancePlans plan)
	{
		boolean flag=false;
		if(plan.getPlanName().length()> 3 && plan.getPlanCoverAmount()>250000)
		{
			flag=true;
		}
		return flag;
}

}
