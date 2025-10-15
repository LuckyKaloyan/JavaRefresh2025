package src.Basics.ForLoop;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersCount = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int total = 0;

        for (int i = 0; i < numbersCount; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            total += number;
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        if (maxNumber*2==total) {
            System.out.println("Yes");
            System.out.println("Sum = "+maxNumber);
        }else{
            System.out.println("No");
            System.out.println("Diff = "+Math.abs(total-maxNumber*2));
        }


    }
}
