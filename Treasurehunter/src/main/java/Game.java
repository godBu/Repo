import java.util.*;

public class Game {
	public static final int totaldistance = 10;
	public static final int position = 8;

	public static void main(String[] args) {
		Treasure gold = new Treasure();
		char playAgain = 0;
		
		gold.hideTreasure();
		
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Treasure has been hidden ");
		
		do {
			System.out.println();
			System.out.print("Enter x and y coordinates: ");
			int yStick = keyboard.nextInt();
			int xStick = keyboard.nextInt();
			
			int dist1 = gold.treasureStatus(xStick, yStick);
			
			if (dist1 = 0 || dist1 == totaldistance) {
				System.out.println("Treasure: found ");	
			}
			else {
				System.out.println("Treasure" + dist1 + " away");
			}
			while
				(!Treasure.isFound());
			
		do {
		    System.out.println("Play again? y/n:");
		    	    playAgain = keyboard.next().charAt(0);
		    }
		    while(Treasure.isFound());

		}

	}
}
