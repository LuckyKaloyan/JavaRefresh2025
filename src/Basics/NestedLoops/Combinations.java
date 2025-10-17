package src.Basics.NestedLoops;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = Integer.parseInt(scanner.nextLine());
        int combinations = 0;

        for (int i = 0; i <= result; i++) {
            for (int j = 0; j <= result; j++) {
                for (int k = 0; k <= result; k++) {
                    if(result == (i+j+k)){
                        combinations++;
                    }
                }
            }
        }
        System.out.println(combinations);
    }
}