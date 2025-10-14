package src.Basics.ConditionalStatements;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double priceOutfit = Double.parseDouble(scanner.nextLine());
        if(statists>150){
            priceOutfit *= 0.90;
        }
        double totalExpenses = priceOutfit*statists+budget*0.1;
        if(budget>=totalExpenses){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", (budget - totalExpenses));
        }else{
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", (totalExpenses - budget));
        }
    }
}