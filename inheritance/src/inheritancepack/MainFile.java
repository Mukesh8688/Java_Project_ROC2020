package inheritancepack;

public class MainFile {

	public static void main(String[] args) {
		
     Employee emp = new Employee(100,"Mukesh","Java Developer", 1000);
     
     emp.printEmployee();
     
     //update object emp
     emp.setDesignation("Full Stack Java Developer");
     
     
     emp.printEmployee();

	}

}
