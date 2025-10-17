package src.Basics.NestedLoops;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            String value = String.valueOf(i);
            int firstDigit = Integer.parseInt(value.substring(0, 1));
            int secondDigit = Integer.parseInt(value.substring(1, 2));
            int thirdDigit = Integer.parseInt(value.substring(2, 3));
            int fourthDigit = Integer.parseInt(value.substring(3, 4));
            if(firstDigit!=0 && secondDigit!=0 && thirdDigit!=0 && fourthDigit!=0){
                if(input%firstDigit==0 && input%secondDigit==0 && input%thirdDigit==0 &&  input%fourthDigit==0 ) {
                    System.out.print(i+" ");
                }
            }
        }
    }
}
