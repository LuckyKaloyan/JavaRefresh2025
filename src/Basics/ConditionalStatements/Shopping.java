package src.Basics.ConditionalStatements;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int cpu = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double videoCardsTotal =videoCards*250;
        double cpuTotal;
        double ramTotal;

        cpuTotal = cpu*videoCardsTotal*0.35;
        ramTotal = ram*videoCardsTotal*0.1;

        double total;

        if(videoCards>cpu){
            total= (videoCardsTotal+cpuTotal+ramTotal)*0.85;
        }else{
            total= cpuTotal+ramTotal+videoCardsTotal;
        }

        if(total>budget){
            System.out.printf("Not enough money! You need %.2f leva more!",total - budget);
        }
        else{
            System.out.printf("You have %.2f leva left!",budget-total);
        }



    }
}
