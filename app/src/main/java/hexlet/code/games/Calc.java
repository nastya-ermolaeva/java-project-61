package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String RULE = "What is the result of the expression?";
    private static final int MAX_NUMBER1 = 100;
    private static final int MAX_NUMBER2 = 21;
    private static final String[] OPERATIONS = {"+", "-", "*"};


    public static void runGame() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number1 = Utils.getRandomNumber(MAX_NUMBER1);
            int number2 = Utils.getRandomNumber(MAX_NUMBER2);
            String operation = OPERATIONS[Utils.getRandomNumber(OPERATIONS.length)];
            questionsAndAnswers[i][0] = number1 + " " + operation + " " + number2;
            questionsAndAnswers[i][1] = Integer.toString(calculate(number1, number2, operation));
        }

        Engine.playGame(RULE, questionsAndAnswers);
    }

    public static int calculate(int number1, int number2, String operation) {
        return switch (operation) {
            case "+" -> number1 + number2;
            case "-" -> number1 - number2;
            case "*" -> number1 * number2;
            default -> 0;
        };
    }
}
