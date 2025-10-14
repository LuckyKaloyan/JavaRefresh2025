package src.Basics.ConditionalStatements;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = Integer.parseInt(scanner.nextLine());
        int seconds2 = Integer.parseInt(scanner.nextLine());
        int seconds3 = Integer.parseInt(scanner.nextLine());
        int sum = seconds + seconds2 + seconds3;
        System.out.print(sum/60 + ":");
        if(sum%60<10){
            System.out.print("0"+sum%60);
        }else  System.out.print(sum%60);
    }
}
