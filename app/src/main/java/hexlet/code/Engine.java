package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;

    public static void playGame(String rule, String[][] questionsAndAnswers) {
        Greet.getByName();
        int numOfCorrectAnswers = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(rule);

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            System.out.println("Question: " + questionsAndAnswers[i][0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim();

            if (userAnswer.equals(questionsAndAnswers[i][1])) {
                System.out.println("Correct!");
                numOfCorrectAnswers += 1;
            } else {
                System.out.println("'" + userAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + questionsAndAnswers[i][1]
                        + "'."
                        + "\nLet's try again, " + Greet.getName() + "!");
                break;
            }
        }

        if (numOfCorrectAnswers == ROUNDS_COUNT) {
            System.out.println("Congratulations, " + Greet.getName() + "!");
        }
    }
}
