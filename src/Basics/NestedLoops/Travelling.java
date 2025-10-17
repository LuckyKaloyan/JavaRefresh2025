package src.Basics.NestedLoops;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destinationName = "";
        double minimumBudget;
        double currentBudget;
        boolean goingAround = true;

        while(goingAround) {
            destinationName = scanner.nextLine();
            if(destinationName.equals("End")) {
                break;
            }
            minimumBudget = Double.parseDouble(scanner.nextLine());
            currentBudget = 0;
            while (currentBudget < minimumBudget) {
                String command = scanner.nextLine();
                if(command.equals("End")){
                    goingAround = false;
                    break;
                }else{
                    currentBudget = currentBudget + Double.parseDouble(command);
                    if(currentBudget >= minimumBudget){
                        System.out.println("Going to "+destinationName+"!");
                    }
                }
            }
            if(!goingAround){
                break;
            }
        }
    }
}