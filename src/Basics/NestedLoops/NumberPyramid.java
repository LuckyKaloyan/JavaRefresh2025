package src.Basics.NestedLoops;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int current = 1;
        boolean isBigger  = false;

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
              if( current>number){
                  isBigger = true;
                  break;
              }
                System.out.print(current + " ");
              current++;
            }
            if(isBigger){
                break;
            }
            System.out.println();
        }


    }
}
