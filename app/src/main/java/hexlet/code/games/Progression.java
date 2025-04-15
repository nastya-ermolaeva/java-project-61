package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {

    public static void findMissingNumber() {
        String rule = "What number is missing in the progression?";
        int rows = 3;
        int columns = 2;
        String[][] questionsAndAnswers = new String[rows][columns];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            int[] progression = new int[10];
            String[] progressionInString = new String[progression.length];

            progression[0] = random.nextInt(30);
            int diff = random.nextInt(19) + 1;

            for (int j = 1; j < progression.length; j++) {
                progression[j] = progression[j - 1] + diff;
            }

            for (int j = 0; j < progressionInString.length; j++) {
                progressionInString[j] = Integer.toString(progression[j]);
            }

            int missingNumber = random.nextInt(10);
            questionsAndAnswers[i][1] = progressionInString[missingNumber];
            progressionInString[missingNumber] = "..";
            questionsAndAnswers[i][0] = String.join(" ", progressionInString);
        }
        Engine.playGame(rule, questionsAndAnswers);
    }
}
