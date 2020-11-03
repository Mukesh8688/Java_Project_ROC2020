package com.tech.bankproject.dao;

import com.tech.bankproject.exception.BusinessException;

public interface BankServicesDAOInterface {
	
	
	public int registerUsername(String username,String password,String email) throws BusinessException;
	
	public boolean IsVerifyUsernamePassword(String username,String password) throws BusinessException;

}
