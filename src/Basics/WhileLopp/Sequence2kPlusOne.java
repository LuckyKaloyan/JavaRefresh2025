package src.Basics.WhileLopp;

import java.util.Scanner;

public class Sequence2kPlusOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = Integer.parseInt(scanner.nextLine());
        int initial = 1;
        while(initial<=target){
            System.out.println(initial);
            initial=initial*2+1;

        }
    }
}
