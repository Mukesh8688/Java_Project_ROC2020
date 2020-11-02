package com.employee.dao.impl;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.sql.Connection;
import java.util.ArrayList;

import com.employee.dao.EmployeeSearchDAO;
import com.employee.dao.dbutil.EmployeeSearchQueries;
import com.employee.dao.dbutil.PostgreSQLConnection;
import com.employee.exception.BussinessException;
import com.employee.model.Employee;

public class EmployeeSearchDAOImpl implements EmployeeSearchDAO {
    
	
	// Search by Employee ID
	@Override
	public Employee getEmployeeById(int empId) throws BussinessException {
		Employee employee = null;
		
		try(Connection connection = PostgreSQLConnection.getConnection() ) {
			
			String sql = EmployeeSearchQueries.getEmployeeById;
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, empId);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				employee = new Employee(empId, resultSet.getString("ename"), resultSet.getString("job"), resultSet.getInt("mgr"), resultSet.getDate("hiredate"), 
						   resultSet.getDouble("sal"), resultSet.getDouble("comm"), resultSet.getString("gender"), resultSet.getString("dname"));
				
				
				
			}else {
				throw new BussinessException("Invalid ID -- No Match record with this id " + empId);
			}
			
		}catch(ClassNotFoundException|SQLException e) {
			
			System.out.println(e.getMessage());
			throw new BussinessException("Internal Error Occured -- Please Conatact DBSADMIN");
		}
		
		
		return employee;
	}
	
	// Retrieving all employee records

	@Override
	public List<Employee> getAllEmployee() throws BussinessException {
		List<Employee> employeeList  = new ArrayList<>();
		
		try(Connection connection = PostgreSQLConnection.getConnection()){
			String sql = EmployeeSearchQueries.getAllEmployees;
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()){
				
				Employee employee = new Employee(resultSet.getInt("empno"), resultSet.getString("ename"), resultSet.getString("job"), resultSet.getInt("mgr"), resultSet.getDate("hiredate"), 
						   resultSet.getDouble("sal"), resultSet.getDouble("comm"), resultSet.getString("gender"), resultSet.getString("dname"));
				
				employeeList.add(employee);
				
			}
			
			if(employeeList.size() == 0) {
				throw new BussinessException("No Employee Records Available !!");
			}
			
			
			

		}catch(ClassNotFoundException|SQLException e) {
			throw new BussinessException("Internal Database Error.. Please Contact DBSADMIN");
		}
		
		
		return employeeList;
	}
	
	
	// Search employee records by employee name 

	@Override
	public List<Employee> getEmployeesByName(String name) throws BussinessException {
		List<Employee> employeeList = new ArrayList<>();
		
		try(Connection connection = PostgreSQLConnection.getConnection()){
			String sql = EmployeeSearchQueries.getEmployeeByName;
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				Employee employee = new Employee(resultSet.getInt("empno"), resultSet.getString("ename"), resultSet.getString("job"), resultSet.getInt("mgr"), resultSet.getDate("hiredate"), 
						   resultSet.getDouble("sal"), resultSet.getDouble("comm"), resultSet.getString("gender"), resultSet.getString("dname"));
				
				employeeList.add(employee);
			}
			
			
			
		}catch(ClassNotFoundException|SQLException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		
		return employeeList;
	}

	@Override
	public List<Employee> getEmployeesByGender(String gender) throws BussinessException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	// Search records by employee hire date

	@Override
	public List<Employee> getEmployeesByHireDate(Date hireDate) throws BussinessException {
	    List<Employee> employeeList = null;
	    
	    try(Connection connection = PostgreSQLConnection.getConnection()){
	    
	    String sql = EmployeeSearchQueries.getEmployeeHireDate;
	    
	    PreparedStatement preparedStatement = connection.prepareStatement(sql);
	    preparedStatement.setDate(1,hireDate);
	    
	    
	    ResultSet resultSet = preparedStatement.executeQuery();
	    
	    while(resultSet.next()) {
	    	
	    	Employee employee = new Employee(resultSet.getInt("empno"), resultSet.getString("ename"), resultSet.getString("job"), resultSet.getInt("mgr"), resultSet.getDate("hiredate"), 
					   resultSet.getDouble("sal"), resultSet.getDouble("comm"), resultSet.getString("gender"), resultSet.getString("dname"));
			
	    	
	    	employeeList.add(employee);
	    }
	    
	    }catch(ClassNotFoundException|SQLException e) {
	    	System.out.println(e.getMessage());
	    	
	    }

		return employeeList;
	}

	@Override
	public List<Employee> getEmployeesByManagerId(String managerId) throws BussinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeesBySalary(double salary) throws BussinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeesByDepartmentId(int deptId) throws BussinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
