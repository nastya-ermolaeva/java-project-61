package hexlet.code;

import hexlet.code.games.Greet;
import hexlet.code.games.Even;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter."
               + "\n1 - Greet"
               + "\n2 - Even"
               + "\n0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        switch (input) {
            case "1":
                Greet.getByName();
                break;
            case "2":
                Even.isNumberEven();
            case "0":
                break;
            default:
                System.out.println("You entered an incorrect number. Let's try again!");
        }
    }
}
