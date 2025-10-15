package src.Basics.ConditionalStatemetsAdvanced;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());


        switch (product) {
            case "coffee":
                switch (city) {
                    case "Plovdiv":
                        System.out.println(amount*0.40);
                        break;
                    case "Varna":
                        System.out.println(amount*0.45);
                        break;
                    case "Sofia":
                        System.out.println(amount*0.50);
                        break;
                }
                break;
            case "water":
                switch (city) {
                    case "Plovdiv":
                        System.out.println(amount*0.70);
                        break;
                    case "Varna":
                        System.out.println(amount*0.70);
                        break;
                    case "Sofia":
                        System.out.println(amount*0.80);
                        break;
                }
                break;
            case "beer":
                switch (city) {
                    case "Plovdiv":
                        System.out.println(amount*1.15);
                        break;
                    case "Varna":
                        System.out.println(amount*1.10);
                        break;
                    case "Sofia":
                        System.out.println(amount*1.20);
                        break;
                }
                break;
            case "sweets":
                switch (city) {
                    case "Plovdiv":
                        System.out.println(amount*1.30);
                        break;
                    case "Varna":
                        System.out.println(amount*1.35);
                        break;
                    case "Sofia":
                        System.out.println(amount*1.45);
                        break;
                }
                break;
            case "peanuts":
                switch (city) {
                    case "Plovdiv":
                        System.out.println(amount*1.50);
                        break;
                    case "Varna":
                        System.out.println(amount*1.55);
                        break;
                    case "Sofia":
                        System.out.println(amount*1.60);
                        break;
                }
                break;
        }
    }
}