package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final String RULE = "What number is missing in the progression?";
    private static final int PROGRESSION_LENGTH = 10;
    private static final int MAX_NUMBER = 30;
    private static final int MAX_DIFF = 19;
    private static final int MIN_DIFF = 2;

    public static void runGame() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int start = Utils.getRandomNumber(MAX_NUMBER);
            int diff = Utils.getRandomNumberInRange(MIN_DIFF, MAX_DIFF);
            int[] progression = buildProgression(start, diff, PROGRESSION_LENGTH);
            String[] progressionInString = new String[PROGRESSION_LENGTH];

            for (int j = 0; j < progressionInString.length; j++) {
                progressionInString[j] = Integer.toString(progression[j]);
            }

            int missingNumber = Utils.getRandomNumber(PROGRESSION_LENGTH);
            questionsAndAnswers[i][1] = progressionInString[missingNumber];
            progressionInString[missingNumber] = "..";
            questionsAndAnswers[i][0] = String.join(" ", progressionInString);
        }

        Engine.playGame(RULE, questionsAndAnswers);
    }

    public static int[] buildProgression(int start, int diff, int length) {
        int[] progression = new int[length];

        for (int i = 0; i < length; i++) {
            progression[i] = start + i * diff;
        }

        return progression;
    }
}
