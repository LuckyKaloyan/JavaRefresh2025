package src.Basics.WhileLopp;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String password = scanner.nextLine();
        String text = "<><><><<>!!!!!!!!!!!!!><><><><><<><>!!!!!!!!!!!!!><<><>";
        while(!password.equals(text)){
            text = scanner.nextLine();
            if(text.equals(password)){
                System.out.printf("Welcome %s!", name);
                break;
            }
        }
    }
}