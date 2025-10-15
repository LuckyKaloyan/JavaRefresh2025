package src.Basics.ConditionalStatemetsAdvanced;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermenCount = Integer.parseInt(scanner.nextLine());
        double discount;
        double extraDiscount = 1;
        double price = 0;

        if (fishermenCount <= 6) {
            discount = 0.90;
        }else if (fishermenCount<=11){
            discount = 0.85;
        }else {
            discount = 0.75;
        }
        if(!season.equals("Autumn")){
            if(fishermenCount%2==0){
                extraDiscount = 0.95;
            }
        }
        if(season.equals("Autumn") || season.equals("Summer")){
            price = 4200;
        }else if(season.equals("Winter")){
            price = 2600;
        }else {
            price = 3000;
        }

        price = price * extraDiscount*discount;

        if(price <= budget){
            System.out.printf("Yes! You have %.2f leva left.", budget-price);
        }else{
            System.out.printf("Not enough money! You need %.2f leva.", price-budget);
        }


        }
}