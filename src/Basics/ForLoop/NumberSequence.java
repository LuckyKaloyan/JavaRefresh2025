package src.Basics.ForLoop;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        int numbersCount = scanner.nextInt();
        for(int i = 0; i < numbersCount; i++){
            int number = scanner.nextInt();
            if(number < minNumber){
                minNumber = number;
            }
            if(number > maxNumber){
                maxNumber = number;
            }
        }
        System.out.println("Max number: " + maxNumber);
        System.out.println("Min number: " + minNumber);
    }
}