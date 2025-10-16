package src.Basics.WhileLopp;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target  = 10000;
        int currentCount = 0;

        while(currentCount < target) {
            try{
                currentCount = currentCount + Integer.parseInt(scanner.nextLine());
                if(currentCount > target) {
                    System.out.println("Goal reached! Good job!\n"+(currentCount - target)+" steps over the goal!");
                    break;
                }
            }catch (Exception e){
                currentCount = currentCount + Integer.parseInt(scanner.nextLine());
                if(currentCount > target) {
                    System.out.println("Goal reached! Good job!\n"+(currentCount - target)+" steps over the goal!");
                    scanner.close();
                    break;
                }else{
                    System.out.println((target-currentCount)+" more steps to reach goal.");
                    scanner.close();
                    break;
                }
            }
        }
    }
}