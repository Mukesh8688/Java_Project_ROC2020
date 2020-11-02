package com.employee.main;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.employee.exception.BussinessException;
import com.employee.model.Employee;
import com.employee.service.EmployeeSearchService;
import com.employee.service.impl.EmployeeSearchServiceImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		
		
		EmployeeSearchService employeeSearchService = new EmployeeSearchServiceImpl();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("WelCome to Mukesh's Employee Search App V1.0");
		System.out.println("-----------------------------------------------");
		
		
		int ch;
		
		do {
			ch = 0 ; // to avoid enter previous  same choice 
			
			System.out.println();
			System.out.println("Employee Search Menu");
			System.out.println("======================");
			System.out.println("1)By ID");
			System.out.println("2)By Name");
			System.out.println("3)By Gender");
			System.out.println("4)By Hire Date");
			System.out.println("5)By Manager Code");
			System.out.println("6)By Salary");
			System.out.println("7)By Department code ");
			System.out.println("8)All Records ");
			System.out.println("9)EXIT");
			
			try {
				
				ch = Integer.parseInt(scanner.nextLine());
				
			}catch(NumberFormatException e) {
				
			}
			
			
			// switch for choice
			
			switch (ch) {
			
			case 1:
				
			    System.out.println("Please enter Employee ID to get Employee Details");
			    try {
			    	
			    	int empId = Integer.parseInt(scanner.nextLine());
			    	
			    	Employee employee = employeeSearchService.getEmployeeById(empId);
			    	if(employee!=null) {
			    		System.out.println("Employee record has been found. Details of Employee ID " +empId + " is following:");
			    		System.out.println();
			    		System.out.println(employee);
			    	}
			    	
			    }catch(NumberFormatException e){
			    	
			    	System.out.println("ID Should be number only -- Please Try Again");
			    	
			    }catch(BussinessException e) {
			    	System.out.println(e.getMessage());
			    }
			    
			 
				break;
				
				
				
			case 2:  		// Search by Employee Name
				
				System.out.println("Enter Employee Name : ");
				
				try {
					
					String employeeName = scanner.nextLine();
					List<Employee> employeeList = employeeSearchService.getEmployeesByName(employeeName.toUpperCase());
					if (employeeList !=null && employeeList.size() > 0) {
						
					    System.out.println(employeeList.toString());
					}
				
				}catch(BussinessException e) {
					
					System.out.println(e.getMessage());
				}
				
				break;
				
				
			case 3:  
				// Search By Gender
				
				System.out.println("Thank You for your interest. This option is still under CONSTRUCTION");
				
				break;
				
				
			case 4: 
				// Search by hire Date 
				
				System.out.println("Enter Hire Date (yyyy-mm-dd): ");
				Date hireDate;
				try {
					try {
				          hireDate = Date.valueOf(scanner.nextLine());
					}catch(Exception e) {
						
						System.out.println("Please REENTER proper data Format (yyyy-mm-dd)");
						break;
					}
				   List<Employee> employeeList  = new ArrayList<>();
				   
				   employeeList = employeeSearchService.getEmployeesByHireDate(hireDate);
				   
				   if(employeeList != null && employeeList.size() > 0) {
					   System.out.println(employeeList);
				   }else {
					   System.out.println("Record Not Found ... Please check proper DATE FORMAT ... Try Again");
				   }
					   
				
				}catch(NumberFormatException e) {
					System.out.println(e.getMessage());
				}catch(BussinessException e) {
					
					System.out.println(e.getMessage());
				}
				
				break;
				
			case 5: // Srearch By Manager Code 
	
				System.out.println("Thank You for your interest. This option is still under CONSTRUCTION");
				
				break;
				
				
			case 6: // Search By Salary
				System.out.println("Thank You for your interest. This option is still under CONSTRUCTION");
				
				break;
				
			case 7: // Search by Department code
				System.out.println("Thank You for your interest. This option is still under CONSTRUCTION");
				
				break;
				
			case 8: // Display all records of Employees
				//System.out.println("Thank You for your interest. This option is still under CONSTRUCTION");
				
				System.out.println(" All Records of Employees :");
				
				try {
					
					List<Employee> employeeList = employeeSearchService.getAllEmployee();
					if (employeeList !=null && employeeList.size() > 0) {
						
						System.out.println("All Emplyees Records!!");
						for(Employee employee : employeeList) {
							System.out.println(employee);
						}
					}
						
					
				}catch(BussinessException e) {
					System.out.println(e.getMessage());
				}
				
				break;
	
			case 9:
				
				System.out.println("Thank You for using -- Mukesh's Employee Search App V1.0--");
				System.out.println("See You Again!!");
				
				break;	

			default:
				System.out.println("Invalid Choice !!! Please enter choice between 1-8 only");
				break;
			}
			
			
			
			
		}while(ch != 9);
		

	}

}
