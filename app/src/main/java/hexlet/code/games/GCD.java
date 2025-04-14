package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {

    public static void findGCD() {
        String rule = "Find the greatest common divisor of given numbers.";
        int rows = 3;
        int columns = 2;
        String[][] questionsAndAnswers = new String[rows][columns];

        for (int i = 0; i < rows; i++) {
            int number1 = (int) (Math.random() * 100) + 1;
            int number2 = (int) (Math.random() * 100) + 1;
            questionsAndAnswers[i][0] = number1 + " " + number2;

            int a = number1;
            int b = number2;
            while (a != 0) {
                int temp = a;
                a = b % a;
                b = temp;
            }
            questionsAndAnswers[i][1] = Integer.toString(b);
        }
        Engine.playGame(rule, questionsAndAnswers);
    }
}
