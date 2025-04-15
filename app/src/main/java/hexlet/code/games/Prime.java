package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static void runGame() {
        String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        int rows = 3;
        int columns = 2;
        String[][] questionsAndAnswers = new String[rows][columns];
        int maxRandomNumber = 1000;

        for (int i = 0; i < rows; i++) {
            int randomNumber = Utils.RANDOM.nextInt(maxRandomNumber);
            questionsAndAnswers[i][0] = Integer.toString(randomNumber);
            questionsAndAnswers[i][1] = Utils.isPrime(randomNumber) ? "yes" : "no";
        }
        Engine.playGame(rule, questionsAndAnswers);
    }
}
