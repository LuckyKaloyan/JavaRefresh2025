package src.Basics.ForLoop;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournamentsCount = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());
        int winningPoints = 0;
        int wonTournaments = 0;

        for (int i = 0; i < tournamentsCount; i++) {
            String reachedPhase = scanner.nextLine();
            if (reachedPhase.equals("W")) {
                winningPoints=winningPoints+2000;
                wonTournaments++;
            } else if (reachedPhase.equals("F")) {
                winningPoints=winningPoints+1200;
            } else {
                winningPoints=winningPoints+720;
            }
        }
        double winningRatio = (double)wonTournaments/tournamentsCount*100;

        System.out.printf("Final points: %d\n",winningPoints+startingPoints);
        System.out.printf("Average points: %d\n",winningPoints/tournamentsCount);
        System.out.printf("%.2f%%", winningRatio);


    }
}
