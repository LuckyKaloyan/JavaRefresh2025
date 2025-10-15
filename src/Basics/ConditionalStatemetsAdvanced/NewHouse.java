package src.Basics.ConditionalStatemetsAdvanced;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double total = 0;

        switch (flower) {
            case "Roses":
                if (amount > 80) {
                    total = amount * 4.5;
                }else {
                    total = amount * 5;
                } break;
            case "Dahlias":
                if (amount > 90) {
                    total = amount * 3.8*0.85;
                }else {
                    total = amount * 3.8;
                } break;
            case "Tulips":
                if (amount > 80) {
                    total = amount * 2.8*0.85;
                }else {
                    total = amount * 2.8;
                } break;
            case "Narcissus":
                if (amount < 120) {
                    total = amount * 3*1.15;
                }else {
                    total = amount * 3;
                } break;
            case "Gladiolus":
                if (amount < 80) {
                    total = amount * 2.5*1.20;
                }else {
                    total = amount * 2.5;
                } break;
        }
        if(total > budget){
            System.out.printf("Not enough money, you need %.2f leva more.",total-budget );
        }else{
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",amount,flower,budget-total);
        }
    }
}
