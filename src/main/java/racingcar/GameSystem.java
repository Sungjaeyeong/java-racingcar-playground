package racingcar;

import java.util.Random;

public class GameSystem {
    private static final int MAX_FUEL = 10;

    public static int getFuel() {
        Random random = new Random();
        return random.nextInt(MAX_FUEL);
    }
}
