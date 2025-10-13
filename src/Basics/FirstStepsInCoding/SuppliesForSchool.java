package src.Basics.FirstStepsInCoding;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pensAmount = Integer.parseInt(scanner.nextLine());
        int markersAmount = Integer.parseInt(scanner.nextLine());
        double detergentLiters = Double.parseDouble(scanner.nextLine());
        double sumPens = pensAmount * 5.80;
        double sumMarks = markersAmount * 7.20;
        double sumDetergent = detergentLiters*1.20;
        double sumEverything = sumPens + sumMarks + sumDetergent;
        double discount = Double.parseDouble(scanner.nextLine())/100;
        System.out.println(sumEverything - sumEverything*discount);
    }
}