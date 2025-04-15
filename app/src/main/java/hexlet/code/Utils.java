package hexlet.code;

import java.util.Random;

public class Utils {
    public static final Random RANDOM = new Random();

    public static int gcd(int a, int b) {
        while (a != 0) {
            int temp = a;
            a = b % a;
            b = temp;
        }
        return b;
    }
}
