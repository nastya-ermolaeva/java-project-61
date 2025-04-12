package hexlet.code.games;

import java.util.Scanner;

public class Greet {
    private static String name;

    public static void getByName() {
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("You didn't enter your name.");
        } else {
            System.out.println("Hello, " + name + "!");
        }
    }

    public static String getName() {
        return name;
    }
}
