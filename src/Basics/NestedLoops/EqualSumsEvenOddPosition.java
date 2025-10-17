package src.Basics.NestedLoops;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for(int i = firstNumber; i <= secondNumber; i++){
            int oddValues = Integer.parseInt(String.valueOf(String.valueOf(i).charAt(0))) + Integer.parseInt(String.valueOf(String.valueOf(i).charAt(2)))+ Integer.parseInt(String.valueOf(String.valueOf(i).charAt(4)));
            int evenValues = Integer.parseInt(String.valueOf(String.valueOf(i).charAt(1))) + Integer.parseInt(String.valueOf(String.valueOf(i).charAt(3)))+ Integer.parseInt(String.valueOf(String.valueOf(i).charAt(5)));
            if(oddValues == evenValues){
                System.out.print(i+" ");
            }
        }
    }
}
