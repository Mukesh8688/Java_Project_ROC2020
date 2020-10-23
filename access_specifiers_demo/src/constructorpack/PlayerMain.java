package constructorpack;

public class PlayerMain {

	public static void main(String[] args) {
		
		
		Player obj = new Player(100, "Mukesh");
		
		obj.displayPlayer();
		
		Team team = new Team(100,"Manchester", "Zidan");
		
		obj.setTeam(team);
		obj.displayPlayer();
		
		
		Player p2 = new Player(101,"Dev Narayan");
		p2.setTeam(team);
		p2.displayPlayer();
		

	}

}
