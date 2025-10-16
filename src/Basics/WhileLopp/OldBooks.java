package src.Basics.WhileLopp;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String favouriteBook = scanner.nextLine();
        String nextBook = "";
        int checkCounter = 0;

        while (!favouriteBook.equals(nextBook)) {
            nextBook = scanner.nextLine();

            if (nextBook.equals("No More Books")) {
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", checkCounter);
                break;
            }else {
                if (nextBook.equals(favouriteBook)) {
                    System.out.printf("You checked %d books and found it.", checkCounter);
                    break;
                }
            }
            checkCounter++;
        }
    }
}