package src.Basics.ForLoop;

import java.util.Scanner;

public class NumbersNto1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for(int i = n; 1 <= i; i--){
            System.out.println(i);
        }
    }
}
