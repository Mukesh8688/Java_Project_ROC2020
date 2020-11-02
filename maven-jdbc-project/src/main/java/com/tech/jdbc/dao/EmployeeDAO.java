package com.tech.jdbc.dao;

import com.tech.jdbc.exception.BussinessException;
import com.tech.jdbc.model.Employee;

public interface EmployeeDAO {
	
	
	public int createEmployeeRecord(Employee employee) throws BussinessException;
	
	public int updateEmployeeSalary(int empId, double salary) throws BussinessException;
	
	public void deleteEmployeeRecord(int empId) throws BussinessException;
	
	public Employee getEmployeeRecordById(int empId) throws BussinessException;

}
