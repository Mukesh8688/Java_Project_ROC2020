package com.tech.jdbc;

import com.tech.jdbc.dao.EmployeeDAO;
import com.tech.jdbc.dao.impl.EmployeeDAOImpl;
import com.tech.jdbc.exception.BussinessException;
import com.tech.jdbc.model.Employee;


import java.util.Scanner;

import java.sql.Date;


public class JdbcMainInputFromConsole {

	public static void main(String[] args) {
		
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("For retrieve Employee Record Please press 1 : ");
		System.out.println("For update Employee Salary Record Please press 2 : ");
		System.out.println("For delete Employee Record Please press 3 : ");
		System.out.println("For insert Employee Record Please press 4 : ");
		
		int key = scanner.nextInt();
		
		
		
		switch (key) {
		
		case 1: // retrieve employee record
			
			try {
				System.out.println("Please enter Employee Id:");
				int empId =scanner.nextInt();
				
				Employee employee = employeeDAO.getEmployeeRecordById(empId);
				if(employee !=null) {
					System.out.println("Employee Id found " + empId);
					System.out.println(employee);
				}
				
			}catch(BussinessException e){
				System.out.println(e.getMessage());
				
			}
			
			
			System.out.println("Good !! Your code is working");
			
			break;
			
			
        case 2:   // update salary record of employee
        	
    		
    		try {
    		       
        	    System.out.println("Enter Employee ID : ");   
      			int empId =scanner.nextInt();
      			
      			System.out.println("Enter Salary which you want to update : ");  
      			double salary = scanner.nextDouble();
    			
    			int c  = employeeDAO.updateEmployeeSalary(empId, salary);
    			if(c>0) {
    				System.out.println("Employee Id =  " + empId + " Record Updated Successfully !!");
    			}
    		
    	     }catch(BussinessException e){
    		      System.out.println(e.getMessage());
   		
    	     }
    	
			System.out.println("Great !! Code Works ");
			break;
        case 3:  // delete employee record
			
			break;
        case 4:   // insert employee record
			
			break;	

		default:
			break;
		}
		
		
		

	}

}
