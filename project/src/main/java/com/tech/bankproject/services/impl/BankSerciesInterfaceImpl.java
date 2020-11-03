package com.tech.bankproject.services.impl;

import com.tech.bankproject.dao.BankServicesDAOInterface;
import com.tech.bankproject.dao.impl.BankServicesDAOImpl;
import com.tech.bankproject.exception.BusinessException;
import com.tech.bankproject.services.BankServicesInterface;

public class BankSerciesInterfaceImpl implements BankServicesInterface{
	
	
	BankServicesDAOInterface bankServiceDAO = new BankServicesDAOImpl();
	
   
   @Override	
   public int registerUsername(String username, String password, String email) throws BusinessException {
	   
	   int c =0;
	   
	 
	   if(username != null && password !=null && email != null) {
		   
		   
		   //username and password should be more than 3 characters
		   if(username.length() > 3 && password.length() > 3) {
			   
			   c = bankServiceDAO.registerUsername(username, password, email);
			   
		   }else {
			   
			   System.out.println();
			   System.out.println("Username and Password should be more than 3 character .... Please Type Again");
		   }
	        	
	     
	   }else {
		   
		   System.out.println();
		   throw new BusinessException("Please Check username, password ... Try Again ...");
	   }
	  
	   
	   
        return c;
		
	}
   
   
   @Override
   public boolean isVerifyUsernamePassword(String username,String password) throws BusinessException{
	   
	   boolean isValide = true;
	   
	   if(username != null && password !=null) {
		   
             if(username.length() > 3 && password.length() > 3) {
			   
            	 isValide = bankServiceDAO.IsVerifyUsernamePassword(username, password);
			   
		     }else {
			   
			   System.out.println();
			   throw new BusinessException("Username and Password don't exist... Sorry ... Please Try Again !!!");
		     }
		   
	   }else{
		   
		   throw new BusinessException("Username and Password don't exist... Sorry ... Please Try Again !!!");
		   
	   }
	   
	   
	   
	   return isValide;
   }

}
