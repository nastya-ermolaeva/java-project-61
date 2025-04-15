package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int MAX_NUMBER = 100;

    public static void runGame() {
        String rule = "Find the greatest common divisor of given numbers.";
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number1 = Utils.RANDOM.nextInt(MAX_NUMBER) + 1;
            int number2 = Utils.RANDOM.nextInt(MAX_NUMBER) + 1;
            questionsAndAnswers[i][0] = number1 + " " + number2;
            int correctAnswer = Utils.gcd(number1, number2);
            questionsAndAnswers[i][1] = Integer.toString(correctAnswer);
        }
        Engine.playGame(rule, questionsAndAnswers);
    }
}
