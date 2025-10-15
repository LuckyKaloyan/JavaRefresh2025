package src.Basics.ForLoop;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int numbersCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbersCount; i++) {
            total = total + Integer.parseInt(scanner.nextLine());
        }

        System.out.println(total);
    }
}
