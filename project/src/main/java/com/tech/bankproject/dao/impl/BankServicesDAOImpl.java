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
			
		
			
			String sql = BankAccountQueries.registerUsername;
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			preparedStatement.setString(3, email);
			
			//execute SQL query
			c = preparedStatement.executeUpdate();
			//System.out.println("Query Succefully executed !!");
	
				
			
		}catch(ClassNotFoundException|SQLException e) {
		    System.out.println(e.getMessage());
			
		}
		
		
		return c;
		
		
	}
    
    
    
    @Override
    public boolean IsVerifyUsernamePassword(String username,String password) throws BusinessException{
    	
    	boolean isValide = true;
    	
    	try(Connection connection = PostgresDBConncetion.getConnection()){
    		
    		String sql = BankAccountQueries.isValide;
    		
    		PreparedStatement preparedStatement = connection.prepareStatement(sql);
    		preparedStatement.setString(1,username);
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
	
	

}
