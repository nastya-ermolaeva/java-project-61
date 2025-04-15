package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int MAX_NUMBER1 = 100;
    private static final int MAX_NUMBER2 = 21;
    private static final int MAX_OPERATIONS = 3;


    public static void runGame() {
        String rule = "What is the result of the expression?";
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number1 = Utils.RANDOM.nextInt(MAX_NUMBER1);
            int number2 = Utils.RANDOM.nextInt(MAX_NUMBER2);
            int operation = Utils.RANDOM.nextInt(MAX_OPERATIONS);

            switch (operation) {
                case 0:
                    questionsAndAnswers[i][0] = number1 + " + " + number2;
                    questionsAndAnswers[i][1] = Integer.toString(number1 + number2);
                    break;
                case 1:
                    questionsAndAnswers[i][0] = number1 + " - " + number2;
                    questionsAndAnswers[i][1] = Integer.toString(number1 - number2);
                    break;
                case 2:
                    questionsAndAnswers[i][0] = number1 + " * " + number2;
                    questionsAndAnswers[i][1] = Integer.toString(number1 * number2);
                    break;
                default:
                    break;
            }
        }
        Engine.playGame(rule, questionsAndAnswers);
    }
}
