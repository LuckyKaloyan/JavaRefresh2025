package src.Basics.ConditionalStatements;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double theRecord = Double.parseDouble(scanner.nextLine());
        int lengthMeters = Integer.parseInt(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());
        double slowness = lengthMeters / 15;
        double slownessInTime = slowness*12.5;

        double timeNeeded = lengthMeters*secondsPerMeter + slownessInTime;
        if(timeNeeded < theRecord){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",timeNeeded);
        }else{
            System.out.printf("No, he failed! He was %.2f seconds slower.",(timeNeeded-theRecord));
        }
    }
}