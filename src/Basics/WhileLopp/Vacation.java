package src.Basics.WhileLopp;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vacationPrice = Double.parseDouble(scanner.nextLine());
        double currentSavings = Double.parseDouble(scanner.nextLine());
        int daysCounter = 0;
        int daysInArow = 0;

        while (currentSavings < vacationPrice && daysInArow < 5) {
            daysCounter++;
            String actionType = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());

            if (actionType.equals("save")){
                daysInArow = 0;
                currentSavings += amount;
                if (currentSavings >= vacationPrice) {
                    System.out.println("You saved the money for "+daysCounter+" days.");
                }
            }else {
                daysInArow++;
                currentSavings -= amount;
                if(currentSavings <= 0){
                    currentSavings = 0;
                }
                if(daysInArow == 5){
                    System.out.println("You can't save the money.");
                    System.out.println(daysCounter);
                    break;
                }
            }




        }


        }
    }