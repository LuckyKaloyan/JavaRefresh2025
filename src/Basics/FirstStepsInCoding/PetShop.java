package src.Basics.FirstStepsInCoding;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int dogsPacksNumber = Integer.parseInt(scanner.nextLine());
        int catsPacksNUmber = Integer.parseInt(scanner.nextLine());
        double totalSum = (dogsPacksNumber*2.5) + (catsPacksNUmber*4);


        System.out.println(totalSum + " lv.");

    }
}
