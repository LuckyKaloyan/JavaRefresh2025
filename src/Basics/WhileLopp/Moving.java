package src.Basics.WhileLopp;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int space = height * width * length;
        int usedSpace = 0;

        while (usedSpace < space) {
            String input = scanner.nextLine();
            if (input.equals("Done")) {
                System.out.printf("%d Cubic meters left.", space-usedSpace);
                break;
            }else{
                usedSpace = usedSpace + Integer.parseInt(input);
                if(usedSpace>space){
                    System.out.printf("No more free space! You need %d Cubic meters more.",usedSpace-space);
                    break;
                }
            }

        }



    }
}
