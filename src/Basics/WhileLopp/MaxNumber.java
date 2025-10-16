package src.Basics.WhileLopp;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int max = Integer.parseInt(number);
        while (!number.equals("Stop")) {
            String num = scanner.nextLine();
            if(num.equals("Stop")){
                break;
            }
            int numberInt = Integer.parseInt(num);
            if (numberInt > max) {
                max = numberInt;
            }
        }
        System.out.println(max);
    }
}