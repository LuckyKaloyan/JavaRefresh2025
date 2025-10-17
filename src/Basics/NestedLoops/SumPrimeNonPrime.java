package src.Basics.NestedLoops;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeSum = 0;
        int nonPrimeSum = 0;
        boolean isPrime = true;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            int number = Integer.parseInt(input);
            if(number<0){
                System.out.println("Number is negative.");
                continue;
            }
               for(int i=2; i<number; i++){
                   if(number % i == 0){
                       nonPrimeSum += number;
                       isPrime = false;
                       break;
                   }
               }
               if(isPrime){
                   primeSum += number;
               }
               isPrime = true;
        }

        System.out.println("Sum of all prime numbers is: " + primeSum);
        System.out.println("Sum of all non prime numbers is: " + nonPrimeSum);

    }
}
