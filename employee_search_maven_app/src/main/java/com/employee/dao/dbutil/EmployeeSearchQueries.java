package com.employee.dao.dbutil;

public class EmployeeSearchQueries {
	
	//public static final String getEmployeeById = "SELECT ename, job, mgr, hiredate, sal, comm,gender,deptno "
	//		+ "FROM public.employee WHERE empno = ?;";
			
			

	public static final String getEmployeeById = " SELECT ename, job, mgr, hiredate, sal, comm,gender,dname\n" +
	"FROM employee  inner join dept  on employee.deptno = dept.deptno " +
	"WHERE empno = ? " ;
	
	
//	public static final String getEmployeeById = " SELECT ename, job, mgr, hiredate, sal, comm,gender,dname" +
//	" FROM employee,dept WHERE employee.deptno = dept.deptno " +
//	" AND employee.empno = ? " ;
	
	
	public static final String getAllEmployees = " SELECT empno, ename, job, mgr, hiredate, sal, comm,gender,dname\n" +
			"FROM employee  inner join dept  on employee.deptno = dept.deptno ;";
	
	// Search query by employee Name 
	public static final String getEmployeeByName = " SELECT empno, ename, job, mgr, hiredate, sal, comm,gender,dname\n" +
			"FROM employee  inner join dept  on employee.deptno = dept.deptno WHERE ename = ?;";
	
	public static final String getEmployeeHireDate = "SELECT empno, ename, job, mgr, hiredate, sal, comm,gender,dname\n" + 
			 "FROM employee  inner join dept  on employee.deptno = dept.deptno WHERE hiredate = ?;";
			
	
	
}
