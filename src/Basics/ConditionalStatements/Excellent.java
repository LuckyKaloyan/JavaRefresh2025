package src.Basics.ConditionalStatements;

import java.util.Scanner;

public class Excellent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double parseDouble = Double.parseDouble(scanner.nextLine());

        if (parseDouble >= 5){
            System.out.println("Excellent!");
        }


    }
}
