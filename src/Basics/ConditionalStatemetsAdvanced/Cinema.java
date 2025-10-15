package src.Basics.ConditionalStatemetsAdvanced;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        int totalSeats = rows * cols;
        double price = 1;

        switch (type) {
            case "Premiere": price = 12.00; break;
            case "Normal": price = 7.50; break;
            case "Discount": price = 5.00; break;
        }
        price = price * totalSeats;
        System.out.printf("%.2f leva", price);

    }
}
