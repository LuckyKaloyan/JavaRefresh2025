package src.Basics.ForLoop;

import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int total = 0;

        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'a': total=total+1; break;
                case 'e': total=total+2; break;
                case 'i': total=total+3; break;
                case 'o': total=total+4; break;
                case 'u': total=total+5; break;
            }
        }
        System.out.println(total);

    }
}
