package src.Basics.WhileLopp;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (sum <= target) {
            sum = sum + Integer.parseInt(scanner.nextLine());
            if (sum >= target) {
                System.out.println(sum);
                break;
            }
        }

    }
}
