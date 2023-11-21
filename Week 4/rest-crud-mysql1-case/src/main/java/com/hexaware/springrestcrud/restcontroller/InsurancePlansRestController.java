package com.hexaware.springrestcrud.restcontroller;

import java.util.List;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrestcrud.entities.InsurancePlans;
import com.hexaware.springrestcrud.exception.InsurancePlanNotFoundException;
import com.hexaware.springrestcrud.service.IInsurancePlansService;
import com.hexaware.springrestcrud.service.InsurancePlansService;

@RestController
@RequestMapping("/api/insuranceplan")
public class InsurancePlansRestController {
	@Autowired
	IInsurancePlansService service;

	@PostMapping("/add/plan")
	public String insertNewPlan(@RequestBody InsurancePlans plans) {
		boolean isValid=InsurancePlansService.inputValidation(plans);
		InsurancePlans plan=null;
		if(isValid)
		{
			service.addInsurancePlan(plans);
		}
		else {
		return "Data Not Inserted";
		}
		return plan+"";
	}

	@PutMapping("/update/plan")
	public InsurancePlans updatePlan(@Valid @RequestBody InsurancePlans plans) {
		return service.updateInsurancePlans(plans);
	}

	@DeleteMapping("/delete/plan/{planId}")
	public String deletePlan(@PathVariable int planId) {
		service.deleteInsurancePlan(planId);
		return "Plan Deleted";
	}
//
//	@GetMapping("/getplan/{planName}")
//	public InsurancePlans getPlanByName(@PathVariable String planName) {
//		return service.getPlanByName(planName);
//	}
	
	@GetMapping("/getplan/{planName}")
	public ResponseEntity<InsurancePlans> getPlanByName(@PathVariable String planName)
	{
		InsurancePlans plan=service.getPlanByName(planName);
			 ResponseEntity<InsurancePlans> response=new ResponseEntity<InsurancePlans>(HttpStatus.FOUND);
			
			if(plan == null)
			{
				try
				{
					throw new InsurancePlanNotFoundException("Insurance Plan Not Found "+planName);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			else
			{
				response=new ResponseEntity<InsurancePlans>(plan, HttpStatus.OK);
			}
		
		return response;
		
	}

	@GetMapping("/get/allplans")
	public List<InsurancePlans> getAllPlans() {
		return service.getAllPlans();
	}

	@GetMapping("/get/sorted/coveramount")
	public List<InsurancePlans> getCoverAmountSorted() {
		return service.getSortedByCoverAmount();
	}
	
	@GetMapping("/get/sortedplans/{planCoverAmount}")
	public List<InsurancePlans> getSortedplans(@PathVariable double planCoverAmount)
	{
		return service.getInsurancePlansSorted(planCoverAmount);
	}
}
