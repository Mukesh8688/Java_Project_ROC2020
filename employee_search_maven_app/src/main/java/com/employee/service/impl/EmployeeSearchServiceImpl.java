package com.employee.service.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.employee.dao.EmployeeSearchDAO;
import com.employee.dao.impl.EmployeeSearchDAOImpl;
import com.employee.exception.BussinessException;
import com.employee.model.Employee;
import com.employee.service.EmployeeSearchService;

public class EmployeeSearchServiceImpl implements EmployeeSearchService{
    
	EmployeeSearchDAO employeeSearchDAO = new EmployeeSearchDAOImpl();
	
	@Override
	public Employee getEmployeeById(int empId) throws BussinessException {
		Employee employee = null;
		
		if(empId >7000 && empId < 8000) {
			
			employee  = employeeSearchDAO.getEmployeeById(empId);
		}else {
			
			throw new BussinessException("Entered Employee Id " + empId + " is INVALID !! .. Please Try Again");
		}
		
		
		return employee;
	}

	@Override
	public List<Employee> getAllEmployee() throws BussinessException {
		
        List<Employee> employeeList = null;
        
        employeeList = employeeSearchDAO.getAllEmployee();
        
		return employeeList;
		
	}
    
	
	// Validate 
	@Override
	public List<Employee> getEmployeesByName(String name) throws BussinessException {
		
		List<Employee> employeeList = new ArrayList<>();
		
		
		if(name !=null) {
			System.out.println("Records Found !!");
			employeeList = employeeSearchDAO.getEmployeesByName(name);
			
			
		}else {
			
			throw new BussinessException("Record Not Found -- Please check employee name. ... Try Again !!");
		}
		
		return employeeList;
	}

	@Override
	public List<Employee> getEmployeesByGender(String gender) throws BussinessException {
		// TODO Auto-generated method stub
		return null;
	}
    
	
	// Validate 
	@Override
	public List<Employee> getEmployeesByHireDate(Date hireDate) throws BussinessException {
		
		List<Employee> employeeList = new ArrayList<>();
		
		
		if(hireDate !=null ) {
			System.out.println("Record Found !!");
			employeeList = employeeSearchDAO.getEmployeesByHireDate(hireDate);
			
		}else {
			
			throw new BussinessException("Record Not Found -- Please Hire Date  !!");
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
