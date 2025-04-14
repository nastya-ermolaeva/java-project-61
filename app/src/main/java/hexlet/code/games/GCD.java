package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Random;

public class GCD {

    public static void findGCD() {
        String rule = "Find the greatest common divisor of given numbers.";
        int rows = 3;
        int columns = 2;
        String[][] questionsAndAnswers = new String[rows][columns];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            int number1 = random.nextInt(100) + 1;
            int number2 = random.nextInt(100) + 1;
            questionsAndAnswers[i][0] = number1 + " " + number2;
            int correctAnswer = Utils.gcd(number1, number2);
            questionsAndAnswers[i][1] = Integer.toString(correctAnswer);
        }
        Engine.playGame(rule, questionsAndAnswers);
    }
}
