package src.Basics.FirstStepsInCoding;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double initialBalance = Double.parseDouble(scanner.nextLine());
        double months = Double.parseDouble(scanner.nextLine());
        double yearInterestRate = Double.parseDouble(scanner.nextLine());
        double monthlyInterestRate = yearInterestRate / 12;
        double total = initialBalance + initialBalance*(monthlyInterestRate * months)/100;
        System.out.println(total);
    }
}
