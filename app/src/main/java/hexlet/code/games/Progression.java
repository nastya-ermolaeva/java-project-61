package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int PROGRESSION_LENGTH = 10;
    private static final int MAX_NUMBER = 30;
    private static final int MAX_DIFF = 19;

    public static void runGame() {
        String rule = "What number is missing in the progression?";
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int[] progression = new int[PROGRESSION_LENGTH];
            String[] progressionInString = new String[progression.length];

            progression[0] = Utils.RANDOM.nextInt(MAX_NUMBER);
            int diff = Utils.RANDOM.nextInt(MAX_DIFF) + 1;

            for (int j = 1; j < progression.length; j++) {
                progression[j] = progression[j - 1] + diff;
            }

            for (int j = 0; j < progressionInString.length; j++) {
                progressionInString[j] = Integer.toString(progression[j]);
            }

            int missingNumber = Utils.RANDOM.nextInt(PROGRESSION_LENGTH);
            questionsAndAnswers[i][1] = progressionInString[missingNumber];
            progressionInString[missingNumber] = "..";
            questionsAndAnswers[i][0] = String.join(" ", progressionInString);
        }
        Engine.playGame(rule, questionsAndAnswers);
    }
}
