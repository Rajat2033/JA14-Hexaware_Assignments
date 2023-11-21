package com.hexaware.Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.hexaware.CalciUnit.Calculator;

class CalculatorTest {

	static Calculator c;

	@BeforeAll
	public static void Obj() {
		System.out.println("Before All");
		c = new Calculator();
	}

	@Test
	@Disabled
	@DisplayName("This Method check whether the output is correct or not")
	void testAdd() {
		System.out.println("Add()");
		int actual = c.add(5, 10);
		assertEquals(15, actual);
		int actual1 = c.add(-4, 3);
		assertEquals(-1, actual1);
	}

	@Test
	@DisplayName("This Method check whether the output is correct or not")
	void testSub() {
		System.out.println("Sub()");
		int actual = c.sub(10, 6);
		assertEquals(4, actual);
		assertNotEquals(1, actual);

	}

	@BeforeEach
	public  void beforeeach() {
		System.out.println("Before Each");
	}

	@AfterEach
	public  void aftereach() {
		System.out.println("After Each");
	}

	@AfterAll
	public static void after() {
		System.out.println("After Method()");
	}

}
