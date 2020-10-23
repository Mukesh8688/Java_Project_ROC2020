package inheritancepack;

public class Employee extends Persion {
	
	private String designation;
	private double salary;
	
	
	// default constructor
	public Employee() {
		
	}
	
	
	// parameter constructor
	
	public Employee(int id,String name, String designation, double salary) {
		super(id,name);
		this.designation = designation;
		this.salary = salary;
	}
	
	
	// getter and setter
	
	public String getDesignation() {
		return designation;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public double getSalary() {
		return salary;
	}
	
	
	public void setSalary(double salary) {
		this.salary =salary;
	}
	
	
	public void printEmployee() {
		System.out.println("Employee Details :");
		printPersion();
		System.out.println("Designation :" + designation);
		System.out.println("Salary :"+ salary);
	}

}
