package src.Basics.ForLoop;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int years = Integer.parseInt(scanner.nextLine());
        double laundrymatPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int toysAmount = 0;
        double totalFunds = 0;

        for(int i=1; i<=years; i++){
            if(i%2==0){
                int payment = i/2;
                totalFunds=totalFunds+(payment*10)-1;
            }else{
                toysAmount++;
            }
        }

        totalFunds = totalFunds+(toysAmount*toyPrice);
        if(totalFunds>=laundrymatPrice){
            System.out.printf("Yes! %.2f",totalFunds-laundrymatPrice);
        }else{
            System.out.printf("No! %.2f",laundrymatPrice-totalFunds);
        }
    }
}