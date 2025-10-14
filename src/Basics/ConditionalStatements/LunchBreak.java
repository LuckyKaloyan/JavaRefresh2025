package src.Basics.ConditionalStatements;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        double lengthEpisode = Double.parseDouble(scanner.nextLine());
        double lunchBreakLength = Double.parseDouble(scanner.nextLine());
        double peace = lunchBreakLength / 4;
        double lunch = lunchBreakLength / 8;

        double totalRest = peace+lunch+lengthEpisode;

        if(totalRest <= lunchBreakLength){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",seriesName,Math.ceil(lunchBreakLength-totalRest));
        }else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",seriesName,Math.ceil(totalRest-lunchBreakLength));
        }
    }
}