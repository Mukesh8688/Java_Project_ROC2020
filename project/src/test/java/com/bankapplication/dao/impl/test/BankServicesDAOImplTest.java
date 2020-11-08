package com.bankapplication.dao.impl.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.bankapplication.dao.BankServicesDAOInterface;
import com.bankapplication.dao.impl.BankServicesDAOImpl;
import com.bankapplication.exception.BusinessException;
import com.bankapplication.services.impl.BankSerciesInterfaceImpl;


import com.bankapplication.dao.dbutil.DbUtilProperties;

class BankServicesDAOImplTest {
	
	private static BankServicesDAOInterface bankServicesDAOImpl ;
	
	
	
	@BeforeAll
	public static void setUpbankServicesDAOImpl() {
		bankServicesDAOImpl = new BankServicesDAOImpl();
	}
	
	
    // test for username = mukesh,password = pass and email = cmukesh8688@gmail.com
	
	@Test
	void testRegisterUsername() throws BusinessException {
		int n  = bankServicesDAOImpl.registerUsername("mukesh", "pass", "cmukesh8688@gmail.com");
		assertEquals(1, n);
	}
	
	

	@Test
	void testIsVerifyUsernamePassword() throws BusinessException {
	  
		boolean isValide = bankServicesDAOImpl.isVerifyUsernamePassword("mukesh", "pass");
		assertTrue(isValide);
     
	}
	
	
	@Test
	void testIsVerifyUsernamePasswordNegative() throws BusinessException {
	  
		boolean isValide = bankServicesDAOImpl.isVerifyUsernamePassword("mukesh", "1111");
		assertFalse(isValide);
     
	}

}
