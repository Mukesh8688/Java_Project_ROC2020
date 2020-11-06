package com.tech.bankproject.model;

import com.tech.bankproject.dao.BankServicesDAOInterface;
import com.tech.bankproject.dao.impl.BankServicesDAOImpl;
import com.tech.bankproject.exception.BusinessException;
import com.tech.bankproject.services.BankServicesInterface;
import com.tech.bankproject.services.impl.BankSerciesInterfaceImpl;

public class SignUpModel {
	
	 // create object to interact BankServices
	
	private static BankServicesInterface bankServicies = new BankSerciesInterfaceImpl();
	
	private static BankServicesDAOInterface bankDAOServices = new BankServicesDAOImpl();
	
	private static RegisterModel registerModel = new RegisterModel();
	
	
	public void bankCustomerSignupMethod() throws BusinessException {
	 
		 System.out.println();
		 System.out.println("Welcome Bank Application Version1.0");
		 System.out.println();
		 
		 System.out.println(" \n******* Register Form **********\n ");
		 System.out.println();
		 
		 // taking input username,password and email from console
		 registerModel.askingUsernamePasswordEmail();
		
		 
		 int c = 0;
		 
		 if (!bankDAOServices.isVerifyExistUsername(registerModel.getUsername(), registerModel.getEmail())) {
		 
		 
				 try {
					 
			   	 c =bankServicies.registerUsername(registerModel.getUsername(), registerModel.getPassword(), registerModel.getEmail());
			   	 
			   	 if(c != 0 ) {
			   		 System.out.println();
			   		 System.out.println("Registration Successfully Done !!");
			   	 }else {
			   		 System.out.println("Please Try Again !!");
			   	 }
				 
				 }catch(BusinessException e) {
					 System.out.println(e.getMessage());
				 }
				 
		 }else {
			 
			 throw new BusinessException("\nUsername OR email address is already registered ...\n"
			 		+ "PLEASE TRY ANOTHER username or email address ...\n"
					 +"THANK YOU");
		 }
	 
	}
	 

}
