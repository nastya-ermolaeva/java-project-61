package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    public static void calculate() {
        String rule = "What is the result of the expression?";
        int rows = 3;
        int columns = 2;
        String[][] questionsAndAnswers = new String[rows][columns];

        for (int i = 0; i < rows; i++) {
            int number1 = Utils.RANDOM.nextInt(100);
            int number2 = Utils.RANDOM.nextInt(21);
            int operation = Utils.RANDOM.nextInt(3);

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
