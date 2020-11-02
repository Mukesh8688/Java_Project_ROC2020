package com.employee.dao;

import java.sql.Date;
import java.util.List;

import com.employee.exception.BussinessException;
import com.employee.model.Employee;

public interface EmployeeSearchDAO {
	
	public Employee getEmployeeById(int empId) throws BussinessException;
	public List<Employee> getAllEmployee() throws BussinessException;
	public List<Employee> getEmployeesByName(String name) throws BussinessException;
	public List<Employee> getEmployeesByGender(String gender) throws BussinessException;
	public List<Employee> getEmployeesByHireDate(Date hireDate) throws BussinessException;
	
	public List<Employee> getEmployeesByManagerId(String managerId) throws BussinessException;
	public Employee getEmployeesBySalary(double salary) throws BussinessException;
	public List<Employee> getEmployeesByDepartmentId(int deptId) throws BussinessException;
	

}
