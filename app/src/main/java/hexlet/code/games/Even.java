package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static void isNumberEven() {
        String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        int rows = 3;
        int columns = 2;
        String[][] questionsAndAnswers = new String[rows][columns];

        for (int i = 0; i < rows; i++) {
            int randomNumber = (int) (Math.random() * 1000);
            questionsAndAnswers[i][0] = Integer.toString(randomNumber);
            questionsAndAnswers[i][1] = (randomNumber % 2 == 0) ? "yes" : "no";
        }

        Engine.playGame(rule, questionsAndAnswers);
    }
}
