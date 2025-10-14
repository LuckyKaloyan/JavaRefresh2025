package src.Basics.ConditionalStatements;

import java.util.Scanner;

public class TimePlus15Seconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int totalMinutes = hours * 60 + minutes + 15;
        if(totalMinutes >= 1440){
            totalMinutes = totalMinutes - 1440;
        }
        int newHours = totalMinutes / 60;
        int newMinutes = totalMinutes % 60;

        System.out.print(newHours + ":");
        if (newMinutes < 10){
            System.out.print("0" + newMinutes);
        }else {
            System.out.print(+ newMinutes);
        }
    }
}