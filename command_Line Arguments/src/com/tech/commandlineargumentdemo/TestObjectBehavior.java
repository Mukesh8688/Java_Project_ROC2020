package com.tech.commandlineargumentdemo;

public class TestObjectBehavior {
	
	private int id;
    private String name;
    
    public TestObjectBehavior() {
		
	}

	public TestObjectBehavior(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public void setvalue(int id,String name ) {
		
		setId(id);
		setName(name);
		
	}

	@Override
	public String toString() {
		return "TestObjectBehavior [id=" + id + ", name=" + name + "]";
	}
	
	
	
	public void setValueTest(TestObjectBehavior obj ) {
		
		 System.out.println("Enter id ");
		 setId(new java.util.Scanner(System.in).nextInt());
		 
		 System.out.println("Name:");
		 setName(new java.util.Scanner(System.in).nextLine());
	}
	
	
	public TestObjectBehavior setValueTestReturnType(TestObjectBehavior obj ) {
		
		 System.out.println("Enter id ");
		 setId(new java.util.Scanner(System.in).nextInt());
		 

		 System.out.println("Name:");
		 setName(new java.util.Scanner(System.in).nextLine());
		 
		 obj.setId(2);
		 
		 return  obj;
	}
	
	
	public void setValueTest() {
		
		 System.out.println("Enter id ");
		 setId(new java.util.Scanner(System.in).nextInt());
		 
		 System.out.println("Name:");
		 setName(new java.util.Scanner(System.in).nextLine());
	}
   
    
    
	
	

}
