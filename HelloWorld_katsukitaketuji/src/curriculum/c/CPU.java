package curriculum.c;

import java.util.Random;

public class CPU {
    private Random random = new Random();

    public int getHand() {
        return random.nextInt(3); // 0〜2
    }
}
