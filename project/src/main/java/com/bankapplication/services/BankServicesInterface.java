package com.bankapplication.services;

import com.bankapplication.exception.BusinessException;
import com.bankapplication.model.account.BankAccount;
import com.bankapplication.model.account.BankAccountRegister;
import com.bankapplication.model.customer.CustomerInfo;

public interface BankServicesInterface {
	
	public int registerUsername(String username,String password,String email) throws BusinessException;
	
	public boolean isVerifyUsernamePassword(String username,String password) throws BusinessException;
	
	public int isVarifyUsertype(String username,String password) throws BusinessException;
	
	public boolean applyNewBankAcoount(CustomerInfo customerinfo,BankAccountRegister bankAccountRegister) throws BusinessException;
	
	public boolean viewAccountBalance(BankAccount bankAccount) throws BusinessException;
	
	public boolean withdraw(BankAccount bankAccount) throws BusinessException;
	
	public boolean deposit(BankAccount bankAccount) throws BusinessException;
	
	public boolean balanceTranfer(BankAccount bankAccount) throws BusinessException;
	
	
	public boolean verifyAccountRequirements(CustomerInfo customerinfo,BankAccountRegister bankAccountRegister) throws BusinessException;

	
}
