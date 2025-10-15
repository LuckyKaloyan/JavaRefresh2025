package src.Basics.ConditionalStatemetsAdvanced;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();

        switch (operation) {
            case "+":
                System.out.printf("%d + %d = %d", firstNumber, secondNumber, firstNumber + secondNumber);
                if((firstNumber+secondNumber)%2==0){
                    System.out.print(" - even");
                }else{
                    System.out.print(" - odd");
                }
                break;
            case "-":
                System.out.printf("%d - %d = %d", firstNumber, secondNumber, firstNumber - secondNumber);
                if((firstNumber-secondNumber)%2==0){
                    System.out.print(" - even");
                }else{
                    System.out.print(" - odd");
                }
                break;
            case "*":
                System.out.printf("%d * %d = %d", firstNumber, secondNumber, firstNumber * secondNumber);
                if((firstNumber*secondNumber)%2==0){
                    System.out.print(" - even");
                }else{
                    System.out.print(" - odd");
                }
                break;
            case "/":
                if(secondNumber == 0){
                    System.out.printf("Cannot divide %d by zero",firstNumber);
                    break;
                }
                System.out.printf("%d / %d = %.2f", firstNumber, secondNumber, (double)firstNumber / (double)secondNumber);
                break;
            case "%":
                if(secondNumber == 0){
                    System.out.printf("Cannot divide %d by zero",firstNumber);
                    break;
                }
                System.out.printf("%d %% %d = %d", firstNumber, secondNumber, firstNumber % secondNumber);
                break;
        }
    }
}
