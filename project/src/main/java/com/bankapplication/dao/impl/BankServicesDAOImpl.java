package com.bankapplication.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;

import com.bankapplication.dao.BankServicesDAOInterface;
import com.bankapplication.dao.dbutil.BankAccountQueries;
import com.bankapplication.dao.dbutil.PostgresDBConncetion;
import com.bankapplication.exception.BusinessException;
import com.bankapplication.model.RegisterModel;
import com.bankapplication.model.account.BankAccountRegister;
import com.bankapplication.model.customer.CustomerInfo;
import com.bankapplication.services.BankUsernamePasswordInterface;
import com.bankapplication.model.RegisterModel;


public class BankServicesDAOImpl implements BankServicesDAOInterface{
	
	
	@Override
    public int registerUsername(String username, String password, String email) throws BusinessException {
    	
    	int c = 0 ;
    	
		try(Connection connection = PostgresDBConncetion.getConnection()){
			
		
			
			String sql = BankAccountQueries.registerUsernameEmployee;
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, username.toLowerCase());   // not Case Sensitive
			preparedStatement.setString(2, password);                // Case Sensitive
			preparedStatement.setString(3, email.toLowerCase());  // not case Sensitive
			preparedStatement.setInt(4, 1);
			
			//execute SQL query
			c = preparedStatement.executeUpdate();
			//System.out.println("Query Succefully executed !!");
	
				
			
		}catch(ClassNotFoundException|SQLException e) {
		    System.out.println(e.getMessage());
			
		}
		
		
		return c;
		
		
	}
    
    
    
    @Override
    public List<RegisterModel> getUserRegisterDetail(String username,String password) throws BusinessException{
    	
    	List<RegisterModel> customerRegisterList = new ArrayList<>();
    	
    	try(Connection connection = PostgresDBConncetion.getConnection()){
    		
    		String sql = BankAccountQueries.isValide;
    		
    		PreparedStatement preparedStatement = connection.prepareStatement(sql);
    		preparedStatement.setString(1,username.toLowerCase());
    		preparedStatement.setString(2, password);
    		
    		ResultSet resultSet = preparedStatement.executeQuery();
    		
    		while(resultSet.next()) {
    			
    		
    			RegisterModel registerModel =  new RegisterModel(resultSet.getInt("id"), resultSet.getString("username"), resultSet.getString("password"),
						resultSet.getString("email"), resultSet.getInt("usertype"));
    			
    			customerRegisterList.add(registerModel);
    			
    		}
    		
    		if(customerRegisterList.size() == 0) {
    			
    			throw new BusinessException(" No User List Found !!! ");
    			
    		}
    		
    	}catch(ClassNotFoundException|SQLException e) {
    		
    		System.out.println(e.getMessage());
    	}
    	
    	
    	return customerRegisterList;
    }
    
    
    @Override
    public int isVarifyUsertype(String username,String password) throws BusinessException{
        
    	
    	int isUserType = 0;
    	
    	try(Connection connection = PostgresDBConncetion.getConnection()){
    		
    		String sql = BankAccountQueries.isUserType;
    		
    		PreparedStatement preparedStatement = connection.prepareStatement(sql);
    		preparedStatement.setString(1,username.toLowerCase());
    		preparedStatement.setString(2, password);
    		
    		ResultSet resultSet = preparedStatement.executeQuery();
    		
    		if(resultSet.next()) {
    			
    			isUserType = resultSet.getInt("usertype");
    		}else {
    			
    			isUserType = 0;
    		}
    		
    	}catch(ClassNotFoundException|SQLException e) {
    		
    		System.out.println(e.getMessage());
    	}
    	
    	
    	return isUserType;
    	
    	
    }
    
    @Override
    public boolean isVerifyExistUsername(String username,String email) throws BusinessException{
    	
    	boolean isVerify = false;
    	
    	
        try(Connection connection = PostgresDBConncetion.getConnection()){
    		
    		String sql = BankAccountQueries.isVerifyUsername;
    		
    		PreparedStatement preparedStatement = connection.prepareStatement(sql);
    		//preparedStatement.setString(1,username);
    		//preparedStatement.setString(1,username);
    		
    		
    		ResultSet resultSet = preparedStatement.executeQuery();
    		
    		//	|| resultSet.getString("email").toLowerCase().equals(email.toLowerCase())
    		
    		while(resultSet.next()) {
    			if(resultSet.getString("username").toLowerCase().equals(username.toLowerCase())
    					|| resultSet.getString("email").toLowerCase().equals(email.toLowerCase())) {
    				
    				isVerify = true;
    				break;
    			}else {
    				
    				isVerify = false;
    				
    			}
    			
    		}
    		
    	}catch(ClassNotFoundException|SQLException e) {
    		
    		System.out.println(e.getMessage());
    	}
    	
    	
    	
    	
    	return isVerify;
    }
    
    
    
    /* Insert all Account requirements into Bank_Account , Bank_customers, Bank_transactions */
    @Override
    public int createBankAccount(CustomerInfo customerInfo , BankAccountRegister bankAccountRegister) throws BusinessException{
    	
    	
    	int success = 0 ;
    	
    	try(Connection connection = PostgresDBConncetion.getConnection()){
    		
    		
     		/* query for bank_customers table*/
    		String insertCustomerInfo  =  BankAccountQueries.insertCustomerInfo;
    		
    		PreparedStatement preparedStatementCustomerInfo = connection.prepareStatement(insertCustomerInfo);
    		preparedStatementCustomerInfo.setString(1,customerInfo.getFirstName().toLowerCase());
    		preparedStatementCustomerInfo.setString(2,customerInfo.getLastName().toLowerCase());
    		preparedStatementCustomerInfo.setString(3,customerInfo.getAddressStreetName().toLowerCase());
    		preparedStatementCustomerInfo.setString(4,customerInfo.getCity().toLowerCase());
    		preparedStatementCustomerInfo.setString(5,customerInfo.getState().toLowerCase());
    		preparedStatementCustomerInfo.setString(7,customerInfo.getPhoneNumber());
    		preparedStatementCustomerInfo.setLong(8,customerInfo.getSSN());
    		preparedStatementCustomerInfo.setDate(9, new java.sql.Date(customerInfo.getJoinDate().getTime()));
    		preparedStatementCustomerInfo.setInt(10,customerInfo.getCustomerRegisterId());
    		preparedStatementCustomerInfo.setString(11,customerInfo.getZipCode());
    		
    		
    		
    		int statusInsertCustomerInfo = preparedStatementCustomerInfo.executeUpdate();
    		
    		
    		/*query for bank_account table */
    		String insertBankAccount = BankAccountQueries.insertBankAccount;
    		
    		PreparedStatement preparedSatementBankAccount = connection.prepareStatement(insertBankAccount);
    		preparedSatementBankAccount.setDouble(1,bankAccountRegister.getBalance() );
    		preparedSatementBankAccount.setDouble(2,bankAccountRegister.getOpeningBalance() );
    		preparedSatementBankAccount.setString(3,bankAccountRegister.getAccountName());
    		preparedSatementBankAccount.setInt(4, bankAccountRegister.getCustomerId());
    	    preparedSatementBankAccount.setDate(5, new Date(bankAccountRegister.getDateOpened().getTime()));
    		preparedSatementBankAccount.setDouble(6, bankAccountRegister.getInterest());
    		preparedSatementBankAccount.setInt(7,bankAccountRegister.getAccountStatus());
    		preparedSatementBankAccount.setInt(8, bankAccountRegister.getAccountType());
    		preparedSatementBankAccount.setString(9, bankAccountRegister.getBranchLoc());
    		
    		
    		int statusInsertBankAccount =  preparedSatementBankAccount.executeUpdate();
    	
    		
    		
    		
    		

    		
    		
    		/*query for transactoin table */
    		/* TransType 
    		 * 1 - Withdraw
    		 * 2- deposit
    		 */
    		String insertTranactions  = BankAccountQueries.insertTranactions;
    		
    		PreparedStatement preparedStatementTransaction = connection.prepareStatement(insertTranactions);
    		preparedStatementTransaction.setInt(1,1);
    		preparedStatementTransaction.setDouble(2,bankAccountRegister.getOpeningBalance());
    		preparedStatementTransaction.setDouble(3, bankAccountRegister.getCustomerAccountNum());
    		preparedStatementTransaction.setDouble(4, bankAccountRegister.getBalance());
    		preparedStatementTransaction.setDate(5,new  Date( new java.util.Date().getTime()));
    		
    		
    		int statusInsertTransaction = preparedStatementTransaction.executeUpdate();
    		
    		if(statusInsertBankAccount == 1 && statusInsertCustomerInfo == 1 && statusInsertTransaction == 1) {
    			success =1;
    		}else {
    			success =0;
    		}
    	
    	
    		
    	}catch(ClassNotFoundException|SQLException e) {
    		
    		System.out.println(e.getMessage());
    	}
    	
	 
     return success;
     
     
    }



	@Override
	public int insertAccountData(BankAccountRegister bankAccountRegister) throws BusinessException {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int insertTranactionata(BankAccountRegister bankAccountRegister) throws BusinessException {
		// TODO Auto-generated method stub
		return 0;
	}
    
    
    
    
    
 
}
