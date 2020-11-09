package com.bankapplication.services.impl;

import com.bankapplication.dao.BankServicesDAOInterface;
import com.bankapplication.dao.impl.BankServicesDAOImpl;
import com.bankapplication.exception.BusinessException;
import com.bankapplication.model.account.BankAccount;
import com.bankapplication.model.account.BankAccountRegister;
import com.bankapplication.model.customer.CustomerInfo;
import com.bankapplication.services.BankServicesInterface;

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
	   
	   boolean isValide = false;
	   
	   if(username != null && password !=null) {
		   
             if(username.length() > 3 && password.length() > 3) {
			   
            	 if(bankServiceDAO.getUserRegisterDetail(username, password).size() != 0) {
            		 isValide = true;
            	 }
			   
		     }else {
			   
			   System.out.println();
			   throw new BusinessException("Username and Password don't exist... Sorry ... Please Try Again !!!");
		     }
		   
	   }else{
		   
		   throw new BusinessException("Username and Password don't exist... Sorry ... Please Try Again !!!");
		   
	   }
	   
	   
	   
	   return isValide;
   }
   
   
   public int isVarifyUsertype(String username,String password) throws BusinessException{
	   
	   /* 1 for Bank Customers
	    * 2 for Bank Employees
	    * 3 for Admin
	    */
	   
	   
	   
	   int isCusEmp = 0;
	   
	   if(username != null && password !=null) {
		   
           if(username.length() > 3 && password.length() > 3) {
			   
        	   isCusEmp = bankServiceDAO.isVarifyUsertype(username, password);
			   
		     }else {
			   
			   System.out.println();
			   throw new BusinessException("Username and Password don't exist... Sorry ... Please Try Again !!!");
		     }
		   
	   }else{
		   
		   throw new BusinessException("Username and Password don't exist... Sorry ... Please Try Again !!!");
		   
	   }
	   
	   
	   return isCusEmp ;
   }


/* This is implementation part of New Bank Account opening Services */   
   
@Override
public boolean applyNewBankAcoount(CustomerInfo customerinfo, BankAccountRegister bankAccountRegister) throws BusinessException {
	boolean isSuccess = false;
	
	
	if(customerinfo != null && bankAccountRegister != null) {
		
		if(bankAccountRegister.getAccountType() != 3) {
			
			if(verifyAccountRequirements(customerinfo, bankAccountRegister)) {
		
	           System.out.println(" You are now DAO Interface :");
	           int status =  bankServiceDAO.createBankAccount(customerinfo, bankAccountRegister);
	           
	           if(status == 1) {
	        	   isSuccess = true;
	           }else {
	        	   isSuccess = false;
	           }
	           
	         
			}else {
				
				throw new BusinessException(" Account Requirements should be fullfil  ");
				
			}
	         
	         
		} else {
			
			throw new BusinessException(" Account Requirements should be fullfil  ");
		}
	
	} else {
		
		throw new BusinessException("Some Data are missing.... Please try Again...Or.. Please contact closest Brank Location. \n ***THANK YOU***");
		
	}
	
	
	return isSuccess;
}


@Override
public boolean viewAccountBalance(BankAccount bankAccount) throws BusinessException {
	// TODO Auto-generated method stub
	return false;
}


@Override
public boolean withdraw(BankAccount bankAccount) throws BusinessException {
	// TODO Auto-generated method stub
	return false;
}


@Override
public boolean deposit(BankAccount bankAccount) throws BusinessException {
	// TODO Auto-generated method stub
	return false;
}


@Override
public boolean balanceTranfer(BankAccount bankAccount) throws BusinessException {
	// TODO Auto-generated method stub
	return false;
}


@Override
public boolean verifyAccountRequirements(CustomerInfo customerinfo,BankAccountRegister bankAccountRegister) throws BusinessException{
	  boolean isvarify =false;
	  
	  /* verify balance */
	  if(bankAccountRegister.getOpeningBalance() > 0 &&  bankAccountRegister.getBalance() > 0 ) {
		  isvarify = true; 
	  }else {
		  
		  throw new BusinessException("Opening should be more than zero value!!");
	  }
	  
	  
	  
	  
	  return isvarify;
}

}
