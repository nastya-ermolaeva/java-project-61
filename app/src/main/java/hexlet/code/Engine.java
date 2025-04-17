package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void playGame(String rule, String[][] questionsAndAnswers) {
        System.out.print("Welcome to the Brain Games!"
                + "\nMay I have your name? ");
        String userName = SCANNER.nextLine().trim();

        if (userName.isEmpty()) {
            System.out.println("You didn't enter your name.");
        } else {
            System.out.println("Hello, " + userName + "!");
        }

        System.out.println(rule);

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            System.out.println("Question: " + questionsAndAnswers[i][0]);
            System.out.print("Your answer: ");
            String userAnswer = SCANNER.nextLine().trim();

            if (userAnswer.equals(questionsAndAnswers[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + questionsAndAnswers[i][1]
                        + "'."
                        + "\nLet's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
