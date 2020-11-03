package com.tech.bankproject.services;

import com.tech.bankproject.exception.BusinessException;

public interface BankServicesInterface {
	
	public int registerUsername(String username,String password,String email) throws BusinessException;
	
	public boolean isVerifyUsernamePassword(String username,String password) throws BusinessException;

}
