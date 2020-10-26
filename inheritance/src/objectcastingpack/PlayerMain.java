package objectcastingpack;

import java.io.PrintStream;

public class PlayerMain {

	public static void main(String[] args) {
		
		
		Player player = new Player(100,"Mukesh",900,"Rhino");
		
		
		
		System.out.println("First object:");
		// Overide toString Object class's method 
		System.out.println(player.toString());
		
		System.out.println(player.hashCode());
		System.out.println(player.getClass());
		
		System.out.println(System.out.toString());
		
		
		System.out.println("This is Second Object");
		
		Player player1 = new Player(100,"Mukesh",901,"Himlayan Rhino");
		
		System.out.println(player1.toString());
		
		
		
		//Override equals method
		
	    System.out.println(player.equals(player1));
	    
	    
	    System.out.println();
	    
	    //Overcasting
	    
	    System.out.println("Casting Demo");
	    Team t = new Player();
	    
	   // t.playerMethod();   Parent class reference variable cannot access to child methods
	    t.teamMethod();
	    
	    
	    System.out.println("\nAfter Casting");
	    Player p = (Player)t;   // casting then it can access
	    
	    p.playerMethod();
	    t.teamMethod();
	    
	    
	    System.out.println("\nCasting");
	    
	    Player pl = new Player();
	    pl.teamMethod();
	    pl.playerMethod();

	}

}
