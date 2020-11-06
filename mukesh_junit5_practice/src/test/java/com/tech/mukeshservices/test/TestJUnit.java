package com.tech.mukeshservices.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

import com.tech.mukeshservices.MukeshTechServices;
import com.tech.mukeshservices.impl.MukeshTechServiceImpl;

public class TestJUnit {
	
	
	private static Logger logger = Logger.getLogger(TestJUnit.class);
	
	private static MukeshTechServices service;
	
	
	
	@BeforeAll
	public static void setUpService() {
		
		logger.info("<****************** Set Up Services ********************");
		service = new MukeshTechServiceImpl();
	}
	
	
	
	@Test
	public void testAdd() {
		logger.info("<================ Starting Add test case ==================>");
		String str = "Junit working fine";
		Assertions.assertEquals("Junit working fine", str);
		
	    logger.info("<================= End test case =====================>");
	}
	
	
	@Test
	public void testIsValidPrimeNumber() {
		logger.info("<================= Starting Prime Number test case ===================>");
		boolean b = service.isValidePrimeNumber(5);
		assertTrue(b);
		logger.info("**************** Test prime number STATUS : " + b + " ******************** ") ;
		logger.info("<================== End test case ====================>");
		
	
	}
	
	
	
	@Test
	public void testIsValidPrimeNumberByassertEqualMethod() {
		
		Assertions.assertEquals(true, service.isValidePrimeNumber(7));
		
	
	}
	
	@Test
	public void testIsValidPrimeNumberNegetive() {
		boolean b = service.isValidePrimeNumber(6);
		assertFalse(b);
	}
	

}
