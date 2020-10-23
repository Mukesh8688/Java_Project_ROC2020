package constructorpack;

public class Team {
	
	private int teamId;
	private String teamName;
	private String teamCoach;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Team(int teamId, String teamName, String teamCoach) {
		this.teamId = teamId;
		this.teamName = teamName;
		this.teamCoach = teamCoach;
	}


	public int getTeamId() {
		return teamId;
	}


	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}


	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public String getTeamCoach() {
		return teamCoach;
	}


	public void setTeamCoach(String teamCoach) {
		this.teamCoach = teamCoach;
	}
	
	
	
	

}
