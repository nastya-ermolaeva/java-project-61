package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n 1 - Greet\n 0 - Exit");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        switch (input) {
            case "1":
                System.out.println("Your choice: " + input);
                Greet.greetingUser();
                break;
            case "0":
                System.out.println("Your choice: " + input);
                break;
            default:
                System.out.println("You entered an incorrect number.");
        }
    }
}
