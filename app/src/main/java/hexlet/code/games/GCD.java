package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final String RULE = "Find the greatest common divisor of given numbers.";
    private static final int MAX_NUMBER = 100;
    private static final int MIN_NUMBER = 1;

    public static void runGame() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number1 = Utils.getRandomNumberInRange(MIN_NUMBER, MAX_NUMBER);
            int number2 = Utils.getRandomNumberInRange(MIN_NUMBER, MAX_NUMBER);
            questionsAndAnswers[i][0] = number1 + " " + number2;
            int correctAnswer = findGCD(number1, number2);
            questionsAndAnswers[i][1] = Integer.toString(correctAnswer);
        }

        Engine.playGame(RULE, questionsAndAnswers);
    }

    public static int findGCD(int a, int b) {
        while (a != 0) {
            int temp = a;
            a = b % a;
            b = temp;
        }
        return b;
    }
}
