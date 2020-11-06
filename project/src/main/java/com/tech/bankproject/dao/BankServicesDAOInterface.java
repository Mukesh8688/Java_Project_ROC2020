package com.tech.bankproject.dao;

import com.tech.bankproject.exception.BusinessException;

public interface BankServicesDAOInterface {
	
	
	public int registerUsername(String username,String password,String email) throws BusinessException;
	
	public boolean isVerifyUsernamePassword(String username,String password) throws BusinessException;
	
	public int isVarifyUsertype(String username,String password) throws BusinessException;
	
	public boolean isVerifyExistUsername(String username,String email) throws BusinessException;
	

}
