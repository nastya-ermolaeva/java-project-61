package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    public static void runGame() {
        String rule = "What number is missing in the progression?";
        int rows = 3;
        int columns = 2;
        String[][] questionsAndAnswers = new String[rows][columns];
        int numInProgression = 10;
        int maxRandomNumber = 30;
        int maxDiff = 19;

        for (int i = 0; i < rows; i++) {
            int[] progression = new int[numInProgression];
            String[] progressionInString = new String[progression.length];

            progression[0] = Utils.RANDOM.nextInt(maxRandomNumber);
            int diff = Utils.RANDOM.nextInt(maxDiff) + 1;

            for (int j = 1; j < progression.length; j++) {
                progression[j] = progression[j - 1] + diff;
            }

            for (int j = 0; j < progressionInString.length; j++) {
                progressionInString[j] = Integer.toString(progression[j]);
            }

            int missingNumber = Utils.RANDOM.nextInt(numInProgression);
            questionsAndAnswers[i][1] = progressionInString[missingNumber];
            progressionInString[missingNumber] = "..";
            questionsAndAnswers[i][0] = String.join(" ", progressionInString);
        }
        Engine.playGame(rule, questionsAndAnswers);
    }
}
