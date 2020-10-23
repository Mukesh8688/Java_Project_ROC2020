package inheritancepack;

public class Persion {
	
    private int id;
    private String name;
    
    
    // default constructor
    public Persion(){
    	
    }
    
    // para constructor
    
    public Persion(int id, String name) {
    	this.id = id;
    	this.name = name;
    }
    
    
    // getter and setter
    
    public int getId() {
    	return id;
    }
    
    public void setId(int id) {
    	this.id =id;
    }
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    
    public void printPersion() {
    	System.out.println("Id :" + id);
    	System.out.println("Name :" + name);
    }
    

}
