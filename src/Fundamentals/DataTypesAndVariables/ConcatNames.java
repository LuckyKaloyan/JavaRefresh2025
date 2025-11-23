package src.Fundamentals.DataTypesAndVariables;

import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        String stick = scanner.nextLine();
        System.out.printf("%s%s%s", firstName, stick, secondName);
    }
}
