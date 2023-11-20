package com.hexaware.springrestcrud.restcontroller;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hexaware.springrestcrud.entities.InsurancePlans;

@SpringBootTest
class InsurancePlansRestControllerTest {

	Logger logger = LoggerFactory.getLogger(InsurancePlansRestControllerTest.class);
	String baseUrl = "http://localhost:8181/api/insuranceplan";

	@Autowired
	RestTemplate restTemplate;

	@Test
	void testInsertNewPlan() {

		InsurancePlans plans = new InsurancePlans();
		plans.setPlanName("MaxLife");
		plans.setPlanCoverAmount(400000);
		plans.setPlanType("Life");
		plans.setPlanDetails("Hello");
		plans.setPlanEmi(4000);
		plans = restTemplate.postForObject(baseUrl + "/add/plan", plans, InsurancePlans.class);

		logger.info("Hello Added:"+plans);
		assertNotNull(plans);
	}

	@Test
	void testUpdatePlan() {
		InsurancePlans plan = new InsurancePlans();
		plan.setPlanId(0);
//		restTemplate.put(baseUrl + "/update/plan", InsurancePlans);
	}

	@Test
	void testDeletePlan() {
		InsurancePlans plans = new InsurancePlans();
		int planId = 1;
//		InsurancePlans plans1 = restTemplate.delete(baseUrl + "/delete/plan/" + planId, plans);

	}

	@Test
	void testGetPlanByName() {
		String planName = "Max";
		ResponseEntity<InsurancePlans> response = restTemplate.getForEntity(baseUrl + "/getplan/" + planName,
				InsurancePlans.class);
		InsurancePlans plans = new InsurancePlans();

		plans.setPlanName("MaxLife");

		logger.info("Hello Insurance plans :" + plans);

		assertTrue(plans.getPlanName() != null);
	}

	@Test
	void testGetAllPlans() {

	}

}
