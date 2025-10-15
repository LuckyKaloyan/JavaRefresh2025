package src.Basics.ConditionalStatemetsAdvanced;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double totalprice = 1;
        String sleepingPlace = "";

        if(budget<=100){
            if(season.equals("summer")){
                totalprice = budget * 0.3;
                sleepingPlace = "Camp";
            }else{
                totalprice = budget * 0.7;
                sleepingPlace = "Hotel";
            }
        }else if(budget<=1000){
            if(season.equals("summer")){
                totalprice = budget * 0.4;
                sleepingPlace = "Camp";
            }else {
                totalprice = budget * 0.8;
                sleepingPlace = "Hotel";
            }
            }else {
            totalprice = budget * 0.9;
            sleepingPlace = "Hotel";
        }
        if(budget<=100){
            System.out.println("Somewhere in Bulgaria");
            System.out.printf(sleepingPlace+ " - %.2f",totalprice);
        }else if(budget<=1000){
            System.out.println("Somewhere in Balkans");
            System.out.printf(sleepingPlace+ " - %.2f",totalprice);
        }else{
            System.out.println("Somewhere in Europe");
            System.out.printf(sleepingPlace+ " - %.2f",totalprice);
        }

    }



}
