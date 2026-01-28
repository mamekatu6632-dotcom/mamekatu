package curriculum.d;

import java.util.Random;

public class Player extends Character {

	private static final Random RAND = new Random();

	public Player(String name) {
		super(
				name,
				RAND.nextInt(51) + 50,
				RAND.nextInt(11) + 5,
				RAND.nextInt(8) + 3);
	}
}