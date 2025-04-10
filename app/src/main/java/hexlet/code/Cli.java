package hexlet.code;
import java.util.Scanner;

public class Cli {

    public static String getByName() {
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
