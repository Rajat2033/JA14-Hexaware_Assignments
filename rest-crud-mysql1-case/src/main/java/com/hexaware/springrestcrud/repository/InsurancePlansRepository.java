package com.hexaware.springrestcrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.springrestcrud.entities.InsurancePlans;

@Repository
public interface InsurancePlansRepository extends JpaRepository<InsurancePlans, Integer> {

	
	public InsurancePlans findByPlanName(String planName);
	
	@Query("select plan from InsurancePlans plan where plan.planCoverAmount>= ?1 order by plan.planEmi")
	public List<InsurancePlans> getInsurancePlansSorted(double planCoverAmount);
}
