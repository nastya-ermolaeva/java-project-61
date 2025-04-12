package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    public static void calculate() {
        String rule = "What is the result of the expression?";
        int rows = 3;
        int columns = 2;
        String[][] questionsAndAnswers = new String[rows][columns];

        for (int i = 0; i < rows; i++) {
            int number1 = (int) (Math.random() * 100);
            int number2 = (int) (Math.random() * 21);
            int operation = (int) (Math.random() * 3);

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
