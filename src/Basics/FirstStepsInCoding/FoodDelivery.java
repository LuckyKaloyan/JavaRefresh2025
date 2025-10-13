package src.Basics.FirstStepsInCoding;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int vegetarianMenus = Integer.parseInt(scanner.nextLine());

        double totalMenus = chickenMenus*10.35 + fishMenus*12.40 + vegetarianMenus*8.15;
        double totalWithDesert = totalMenus*1.20;
        double delivery = 2.50;

        System.out.println(totalWithDesert+delivery);

    }
}