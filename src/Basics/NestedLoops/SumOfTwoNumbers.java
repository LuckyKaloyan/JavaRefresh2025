package src.Basics.NestedLoops;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int combinations = 0;
        boolean magicFound = false;


        for (int i = firstNumber; i <= secondNumber; i++) {
            for (int j = firstNumber; j <= secondNumber; j++) {
                combinations ++;
                if(i+j==magicNumber){
                    System.out.printf("Combination N:%d (%d + %d = %d)",combinations,i,j,magicNumber);
                    magicFound = true;
                    scanner.close();
                    break;
                }
            }
            if(magicFound){
                scanner.close();
                break;
            }
        }
        if(!magicFound){
            System.out.printf("%d combinations - neither equals %d",combinations,magicNumber);
        }
    }
}