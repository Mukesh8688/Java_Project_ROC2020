package objectcastingpack;

public class Player extends Team{
	
	private int id;
	private String name;
	
	//default constructor
	
	public Player() {
		
	}
	
	
	// para constructor
	
	public Player(int id ,String name, int teamId, String teamName) {
		super(teamId,teamName);
		this.id =id;
		this.name= name;
	}
	
	
	//getter and setter
	
	
	public int getId() {
		return id;
	}
	
	public void setId( int id) {
		this.id =id;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name= name;
	}


//	@Override
//	public String toString() {
//		return "Player [id=" + id + ", name=" + name + "]";
//	}
	
	
	@Override
	public String toString() {
		return " Player id " + id + "  \n  Name " + name;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		boolean b = false;
		
		Player p2 =(Player)obj ;
		
		if(this.id == p2.id) {
			b =true;
		}
		
		return b;
	}
	
	
	
	
	
	
   public void playerMethod() {
	   System.out.println("This is playerMethods");
   }
	

}
