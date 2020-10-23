package objectcastingpack;

import java.io.PrintStream;

public class PlayerMain {

	public static void main(String[] args) {
		
		
		Player player = new Player(100,"Mukesh");
		
		
		// Overide toString Object class's method 
		System.out.println(player.toString());
		
		System.out.println(player.hashCode());
		System.out.println(player.getClass());
		
		System.out.println(System.out.toString());
		
		Player player1 = new Player(100,"Mukesh");
		
		System.out.println(player1.toString());
		
		
		
		//Override equals method
		
	    System.out.println(player.equals(player1));

	}

}
