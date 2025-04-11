package hexlet.code;
import java.util.Scanner;

public class Even {

    public static void isNumberEven() {
        int maxAttempts = 3;
        int numOfCorrectAnswers = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (numOfCorrectAnswers < maxAttempts) {
            int randomNumber = (int) (Math.random() * 1000);
            System.out.println("Question: " + randomNumber);
            String correctAnswer = (randomNumber % 2 == 0) ? "yes" : "no";
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                numOfCorrectAnswers += 1;
            } else {
                System.out.println("'" + userAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer
                        + "'.");
                break;
            }
        }
        if (numOfCorrectAnswers == maxAttempts) {
            System.out.println("Congratulations, " + Greet.getName() + "!");
        } else {
            System.out.println("Let's try again, " + Greet.getName() + "!");
        }
    }
}
