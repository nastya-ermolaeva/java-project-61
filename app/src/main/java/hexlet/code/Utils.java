package hexlet.code;

import java.util.Random;

public class Utils {
    public static final Random RANDOM = new Random();

    public static int getRandomNumberInRange(int min, int max) {
        return RANDOM.nextInt(max - min + 1) + min;
    }

    public static int getRandomNumber(int max) {
        return RANDOM.nextInt(max);
    }
}
