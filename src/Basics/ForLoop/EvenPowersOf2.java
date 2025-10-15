package src.Basics.ForLoop;

import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int begining = 1;

        for(int i=0; i<=n; i++){

            if(i%2==0){
                System.out.println(begining);
            }
            begining *= 2;
        }
    }
}
