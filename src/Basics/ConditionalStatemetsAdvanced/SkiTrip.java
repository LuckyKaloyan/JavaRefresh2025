package src.Basics.ConditionalStatemetsAdvanced;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysStaying = Integer.parseInt(scanner.nextLine());
        daysStaying--;
        String roomType = scanner.nextLine();
        String mark = scanner.nextLine();
        double tip = 0.9;
        if (mark.equals("positive")) {
            tip = 1.25;
        }
        double discount = 1;
        double pricePerDay = 1;

        switch (roomType) {
            case "apartment":
                pricePerDay = 25;
                if (daysStaying < 10) {
                    discount = 0.70;
                } else if (daysStaying < 15) {
                    discount = 0.65;
                } else {
                    discount = 0.50;
                }
                break;
            case "president apartment":
                pricePerDay = 35;
                if (daysStaying < 10) {
                    discount = 0.90;
                } else if (daysStaying < 15) {
                    discount = 0.85;
                } else {
                    discount = 0.80;
                }
                break;
            default:
                pricePerDay = 18;
                break;
        }
        System.out.printf("%.2f",daysStaying*pricePerDay*discount*tip);
    }
}