package com.bankapplication.dao;

import java.util.List;


import com.bankapplication.exception.BusinessException;
import com.bankapplication.model.RegisterModel;
import com.bankapplication.model.account.BankAccountRegister;
import com.bankapplication.model.customer.CustomerInfo;

public interface BankServicesDAOInterface {
	
	
	public int registerUsername(String username,String password,String email) throws BusinessException;
	
	public List<RegisterModel> getUserRegisterDetail(String username,String password) throws BusinessException;
	
	public int isVarifyUsertype(String username,String password) throws BusinessException;
	
	public boolean isVerifyExistUsername(String username,String email) throws BusinessException;
	
	public int createBankAccount(CustomerInfo customerInfo,BankAccountRegister bankAccountRegister) throws BusinessException;
	
	public int insertAccountData(BankAccountRegister bankAccountRegister) throws BusinessException;
	
	
	public int insertTranactionata(BankAccountRegister bankAccountRegister) throws BusinessException;


	

}
