package com.employee.model;

import java.sql.Date;

public class Employee {
	
	private int empNo;
	private String employeeName;
	private String job;
	private int mgr;
	private Date hireDate;
	private double salary;
	private double commission;
	private String gender;
	private String deptName;
	
	
	// constructor
	
	public Employee() {
		
	}
	
	
	public Employee(int empNo,String employeeName,String job,
			int mgr,Date hireDate,double salary,double commission,String gender,String deptName) {
		
		super();
		this.empNo = empNo;
		this.employeeName = employeeName;
		this.job = job;
		this.mgr = mgr;
		this.hireDate = hireDate;
		this.salary = salary;
		this.commission = commission;
		this.gender = gender;
		this.deptName = deptName;
		
	}
	
	
	// setter and getter
	
	public int getId() {
		return empNo;
	}
	
	public void setId(int empNo) {
		this.empNo = empNo;
	}
	
	public String getName() {
		return employeeName;
	}
	
	public void setName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getJob() {
		return job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	
	public int getMgr() {
		return mgr;
	}
	
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	
	
	public Date getDate() {
		return hireDate;
	}
	
	public void setDate(Date hireDate) {
		this.hireDate = hireDate;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public double getCommission() {
		return commission;
	}


	public void setCommission(double commission) {
		this.commission = commission;
	}
    
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDeptName() {
		return deptName;
	}


	public void setDepName(String deptName) {
		this.deptName = deptName;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [empNo =" + empNo + ", Employee Name ="+ employeeName + ", job = " +job +
				", Manager No = " + mgr + ", Hire Date = " + hireDate + ", Salary = " 
				+ salary + ", Commission = "+commission + ", Gender = "+ gender + ", Department  = " + deptName + " ] ";
				
	}
	
	 
	
	
	

}

