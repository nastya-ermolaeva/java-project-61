package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {

    public static void isNumberEven() {
        String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        int rows = 3;
        int columns = 2;
        String[][] questionsAndAnswers = new String[rows][columns];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            int randomNumber = random.nextInt(1000);
            questionsAndAnswers[i][0] = Integer.toString(randomNumber);
            questionsAndAnswers[i][1] = (randomNumber % 2 == 0) ? "yes" : "no";
        }

        Engine.playGame(rule, questionsAndAnswers);
    }
}
