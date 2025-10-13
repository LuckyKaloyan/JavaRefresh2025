package src.Basics.FirstStepsInCoding;

import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputUsd = Double.parseDouble(scanner.nextLine());
        double bgn = inputUsd * 1.79549;
        System.out.println(bgn);
    }
}
