package src.Basics.FirstStepsInCoding;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentSand = Double.parseDouble(scanner.nextLine());

        double volume = length * width * height;
        double sandVolume = volume * percentSand/100;
        double waterVolume = volume - sandVolume;

        System.out.println(waterVolume/1000);





    }
}
