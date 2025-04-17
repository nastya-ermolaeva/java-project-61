package hexlet.code;
import java.util.Scanner;

public class Cli {

    public static void getByName() {
        System.out.print("Welcome to the Brain Games!"
                + "\nMay I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("You didn't enter your name.");
        } else {
            System.out.println("Hello, " + name + "!");
        }
    }
}
