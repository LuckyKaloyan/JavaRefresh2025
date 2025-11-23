package src.Fundamentals.DataTypesAndVariables;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.3f", input*1.36);
    }
}
