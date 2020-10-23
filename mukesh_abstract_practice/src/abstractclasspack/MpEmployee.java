package abstractclasspack;

public class MpEmployee extends EmployeeAbstract {
	
	private String designation;
	
	public MpEmployee() {
		
	}
	
	public MpEmployee(int id , String name,String designation) {
		
		super(id,name);
		this.designation = designation;
		
		
	}
	
	@Override
	public void display() {
		
		System.out.println("id =" + super.getId());
		System.out.println("Name = "+ super.getName());
		System.out.println("Designantion = " + designation);
		
	}

}
