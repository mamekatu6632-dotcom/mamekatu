package curriculum.d;

import java.util.Random;

public class Player extends Character {

	
	  public Player(String name, Random rand) {
	        super(
	            name,
	            rand.nextInt(51) + 50, // HP
	            rand.nextInt(11) + 5,  // AT
	            rand.nextInt(8) + 3    // SP
	        );
	    }
	}