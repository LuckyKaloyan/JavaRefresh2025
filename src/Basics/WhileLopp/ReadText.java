package src.Basics.WhileLopp;

import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        if(!text.equals("Stop")){
            System.out.println(text);
        }
        while (!text.equals("Stop")) {
            text = scanner.nextLine();
            if(text.equals("Stop")){
                break;
            }
            System.out.println(text);
        }
    }
}
