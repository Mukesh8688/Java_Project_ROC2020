package com.tech.jdbc;

import com.tech.jdbc.dao.EmployeeDAO;
import com.tech.jdbc.dao.impl.EmployeeDAOImpl;
import com.tech.jdbc.exception.BussinessException;
import com.tech.jdbc.model.Employee;

import java.sql.Date;

public class JdbcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		
		// Retrive record
		
//		try {
//			
//			int empId =7521;
//			
//			Employee employee = employeeDAO.getEmployeeRecordById(empId);
//			if(employee !=null) {
//				System.out.println("Employee Id found " + empId);
//				System.out.println(employee);
//			}
//			
//		}catch(BussinessException e){
//			System.out.println(e.getMessage());
//			
//		}
		
		//update 
		
			try {
			
	  			int empId =7903;
	  			double salary = 7000.00;
				
				int c  = employeeDAO.updateEmployeeSalary(empId, salary);
				if(c>0) {
					System.out.println("Employee Id =  " + empId + " Record Updated Successfully !!");
				}
			
		     }catch(BussinessException e){
			      System.out.println(e.getMessage());
			
		     }
		
		
		
		
		
		// Delete record
		
//        try {
//			
//			int empId =7903;
//			
//			employeeDAO.deleteEmployeeRecord(empId);;
//		
//			System.out.println("Employee No: "+ empId +  " Record deleted Successfully");
//			
//			
//		}catch(BussinessException e){
//			System.out.println(e.getMessage());
//			
//		}
//		
		// Insert record
		
//        try {
//        	 
//        	int empNo = 7903;
//        	String employeeName = "Mukesh";
//        	String job = "Java Developer";
//        	int mgr = 7566;
//        	Date hireDate =Date.valueOf("2020-11-01");
//        	double salary = 6000.00;
//        	double commission = 0.0;
//        	int deptNo = 20;
//			
//        	Employee employee = new Employee(empNo, employeeName, job, mgr, hireDate, salary, commission, deptNo);
//		    int c = employeeDAO.createEmployeeRecord(employee);
//			
//        	if(c>0) {
//        		System.out.println("Employee Record inserted");
//        		System.out.println(employee);
//        	}
//			
//		}catch(BussinessException e){
//			System.out.println(e.getMessage());
//			
//		}

	}

}
