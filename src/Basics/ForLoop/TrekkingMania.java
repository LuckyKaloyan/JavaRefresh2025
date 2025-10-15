package src.Basics.ForLoop;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupsCount = Integer.parseInt(scanner.nextLine());
        int totalPeople = 0;
        int musalaGroups = 0;
        int monblanGroups = 0;
        int kilimanjaroGroups = 0;
        int k2Groups = 0;
        int everestGroups = 0;


        for (int i = 0; i < groupsCount; i++) {
            int groupNumberOfPeople = Integer.parseInt(scanner.nextLine());
            if (groupNumberOfPeople <= 5) {
                musalaGroups=musalaGroups + groupNumberOfPeople;
                totalPeople = totalPeople + groupNumberOfPeople;
            }else if (groupNumberOfPeople <= 12) {
                monblanGroups=monblanGroups + groupNumberOfPeople;
                totalPeople = totalPeople + groupNumberOfPeople;
            }else if (groupNumberOfPeople <= 25) {
                kilimanjaroGroups=kilimanjaroGroups + groupNumberOfPeople;
                totalPeople = totalPeople + groupNumberOfPeople;
            }else if (groupNumberOfPeople <= 40) {
                k2Groups=k2Groups + groupNumberOfPeople;
                totalPeople = totalPeople + groupNumberOfPeople;
            }else {
                everestGroups=everestGroups + groupNumberOfPeople;
                totalPeople = totalPeople + groupNumberOfPeople;
            }
        }
        System.out.printf("%.2f%%\n",(double) musalaGroups/totalPeople*100);
        System.out.printf("%.2f%%\n",(double) monblanGroups/totalPeople*100);
        System.out.printf("%.2f%%\n",(double) kilimanjaroGroups/totalPeople*100);
        System.out.printf("%.2f%%\n",(double) k2Groups/totalPeople*100);
        System.out.printf("%.2f%%\n",(double) everestGroups/totalPeople*100);


    }
}
