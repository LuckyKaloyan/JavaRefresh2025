package src.Basics.WhileLopp;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;

        while (scanner.hasNextLine()) {
            try {
                double amount = Double.parseDouble(scanner.nextLine());
                if(amount>0){
                    System.out.printf("Increase: %.2f\n", amount);
                    total += amount;
                }else{
                    System.out.println("Invalid operation!");
                    System.out.printf("Total: %.2f", total);
                    break;
                }
            }catch (NumberFormatException e){
                    System.out.printf("Total: %.2f", total);
                    break;
            }

        }
    }
}
