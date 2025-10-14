package src.Basics.ConditionalStatements;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzlesAmount = Integer.parseInt(scanner.nextLine());
        int talkingDollsAmount = Integer.parseInt(scanner.nextLine());
        int teddyBearsAmount = Integer.parseInt(scanner.nextLine());
        int minionsAmount = Integer.parseInt(scanner.nextLine());
        int trucksAmount = Integer.parseInt(scanner.nextLine());
        int totalAmount = puzzlesAmount + talkingDollsAmount + teddyBearsAmount + minionsAmount + trucksAmount;
        double totalFunds = talkingDollsAmount*3 + puzzlesAmount*2.60 + teddyBearsAmount*4.10+ minionsAmount*8.20 + trucksAmount*2;
        if(totalAmount >=50){
            totalFunds = totalFunds*0.75;
        }
        totalFunds = 0.9*totalFunds;

        if(totalFunds >= tripPrice){
            System.out.printf("Yes! %.2f lv left.",(totalFunds-tripPrice));
        }else{
            System.out.printf("Not enough money! %.2f lv needed.", (tripPrice-totalFunds));
        }

    }
}
