package src.Basics.ForLoop;

import java.util.Scanner;

public class NumbersEndingIn7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<1000; i++){
            if(String.valueOf(i).endsWith("7")){
                System.out.println(i);
            }
        }
    }
}
