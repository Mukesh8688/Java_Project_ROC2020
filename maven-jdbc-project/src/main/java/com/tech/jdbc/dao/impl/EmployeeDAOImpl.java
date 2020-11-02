package com.tech.jdbc.dao.impl;

import com.tech.jdbc.dao.EmployeeDAO;
import com.tech.jdbc.dbutil.PostgresDbConnection;
import com.tech.jdbc.exception.BussinessException;
import com.tech.jdbc.model.Employee;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public int createEmployeeRecord(Employee employee) throws BussinessException {
		
		int c =0;
		try(Connection connection = PostgresDbConnection.getConnection()){
			
			String sql = "INSERT INTO public.employee" + 
					"(empno, ename, job, mgr, hiredate, sal, comm, deptno) " +
					"VALUES(?,?, ?, ?, ?, ?, ?, ?);";
			
			PreparedStatement preparedSatement  = connection.prepareStatement(sql);
			preparedSatement.setInt(1, employee.getId());
			preparedSatement.setString(2, employee.getName());
			preparedSatement.setString(3,employee.getJob());
			preparedSatement.setInt(4, employee.getMgr());
			preparedSatement.setDate(5, employee.getDate());
			preparedSatement.setDouble(6, employee.getSalary());
			preparedSatement.setDouble(7, employee.getCommission());
			preparedSatement.setInt(8, employee.getDeptNo());
			
			c = preparedSatement.executeUpdate();
			
			
		}catch(ClassNotFoundException|SQLException e) {
			System.out.println(e);
			throw new BussinessException("Internal Error -- please check database syntax !!");
		}
	
		return c;
	}

	@Override
	public int updateEmployeeSalary(int empId, double salary) throws BussinessException {
	
		int c = 0;
		
		try(Connection connection = PostgresDbConnection.getConnection()){
			
			String sql = "UPDATE public.employee SET sal = ?" +
			              " WHERE empno = ?";
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setDouble(1, salary);
			preparedStatement.setInt(2, empId);
			
			c = preparedStatement.executeUpdate();
			
		}catch(ClassNotFoundException|SQLException e) {
			System.out.println(e);
			throw new BussinessException("Invalide Id --- Please Check Employee Id");
		}
		
		return c;
	}

	@Override
	public void deleteEmployeeRecord(int empId) throws BussinessException {
       
		
		try(Connection connection = PostgresDbConnection.getConnection()){
			
			String sql = "DELETE FROM public.employee WHERE empno = ?";
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, empId);
			
			preparedStatement.executeUpdate();
			
		}catch(ClassNotFoundException|SQLException e) {
			System.out.println(e);
			throw new BussinessException("Invalide Id --- Please Check Employee Id");
		}
	

	}

	@Override
	public Employee getEmployeeRecordById(int empId) throws BussinessException {

		Employee employee =null;
		
		try(Connection connection = PostgresDbConnection.getConnection() ){
			
			String sql = "SELECT ename, job, mgr, hiredate, sal, comm, deptno\n"
					+ "FROM public.employee WHERE empno = ? ; ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1,empId);
			
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
			    employee = new Employee(empId, resultSet.getString("ename"), resultSet.getString("job"),
			    		resultSet.getInt("mgr"), resultSet.getDate("hiredate"),resultSet.getDouble("sal"), 
			    		resultSet.getDouble("comm"), resultSet.getInt("deptno"));
			}else {
				
				throw new BussinessException("Invalid Employee Id");
			}
			
			
			
		}catch(ClassNotFoundException | SQLException e) {
			
			System.out.println(e);
			throw new BussinessException("Internal Error ... ");
			
		}
		
		
		
		return employee;
	}

}
