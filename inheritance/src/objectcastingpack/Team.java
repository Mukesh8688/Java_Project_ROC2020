package objectcastingpack;

public class Team {
	
	
	private int teamId;
	private String teamName;
	
	// de fault constructor
	public Team() {
		
	}
	
	public Team(int teamId, String teamName) {
		
		this.teamId = teamId;
		this.teamName= teamName;
	}
	
	
	
	// getter and setter
	
	public int getId() {
		return teamId;
	}
	
	public void setId(int teamId) {
		this.teamId = teamId;
	}
	
	
	public String getTeamName() {
		return teamName;
	}
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	
	
	public void teamMethod() {
		System.out.println("This is team Method");
	}
	
	
	

}
