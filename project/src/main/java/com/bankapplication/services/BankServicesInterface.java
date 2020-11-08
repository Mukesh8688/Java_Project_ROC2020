package com.bankapplication.services;

import com.bankapplication.exception.BusinessException;

public interface BankServicesInterface {
	
	public int registerUsername(String username,String password,String email) throws BusinessException;
	
	public boolean isVerifyUsernamePassword(String username,String password) throws BusinessException;
	
	public int isVarifyUsertype(String username,String password) throws BusinessException;

}
