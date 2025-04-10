package hexlet.code;
import java.util.Scanner;

public class Cli {

    public static String getByName() {
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("You didn't enter your name. Let's try again!");
            return getByName();
        }
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
