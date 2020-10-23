package constructorpack;

public class Player {
	
	private int playerId;
	private String playerName;
	private Team team;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Player(int playerId, String playerName) {
		
		this.playerId = playerId;
		this.playerName = playerName;
	
	}


	public int getPlayerId() {
		return playerId;
	}


	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}


	public String getPlayerName() {
		return playerName;
	}


	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}


	public Team getTeam() {
		return team;
	}


	public void setTeam(Team team) {
		this.team = team;
	}
	
	
	public void displayPlayer() {
		
		System.out.println("\n");
		System.out.println("Player Id =" + getPlayerId());
		System.out.println("Player Name = " + getPlayerName());
		
		if(team != null) {
			
			System.out.println("Team ID = "+team.getTeamId());
			System.out.println("Team Name = " + team.getTeamName());
			System.out.println("Team Coach = " + team.getTeamCoach());
		}
	}
	

}
