package com.tech.bankproject.dao.impl;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tech.bankproject.dao.BankServicesDAOInterface;
import com.tech.bankproject.dao.dbutil.BankAccountQueries;
import com.tech.bankproject.dao.dbutil.PostgresDBConncetion;
import com.tech.bankproject.exception.BusinessException;


public class BankServicesDAOImpl implements BankServicesDAOInterface{
	
	
	@Override
    public int registerUsername(String username, String password, String email) throws BusinessException {
    	
    	
    	int c = 0;
    	
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
    public boolean isVerifyUsernamePassword(String username,String password) throws BusinessException{
    	
    	boolean isValide = true;
    	
    	try(Connection connection = PostgresDBConncetion.getConnection()){
    		
    		String sql = BankAccountQueries.isValide;
    		
    		PreparedStatement preparedStatement = connection.prepareStatement(sql);
    		preparedStatement.setString(1,username.toLowerCase());
    		preparedStatement.setString(2, password);
    		
    		ResultSet resultSet = preparedStatement.executeQuery();
    		
    		if(resultSet.next()) {
    			
    			isValide = true;
    		}else {
    			
    			isValide = false;
    		}
    		
    	}catch(ClassNotFoundException|SQLException e) {
    		
    		System.out.println(e.getMessage());
    	}
    	
    	
    	return isValide;
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
	
	

}
