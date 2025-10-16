package src.Basics.WhileLopp;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int totalPieces = width * length;
        int cutPieces = 0;
        while(cutPieces <= totalPieces) {
            String line = scanner.nextLine();
            if(line.equals("STOP")) {
                System.out.printf("%d pieces are left.",totalPieces - cutPieces);
                break;
            }else{
                int pieceSize = Integer.parseInt(line);
                if(pieceSize+cutPieces > totalPieces) {
                    System.out.printf("No more cake left! You need %d pieces more.",pieceSize+cutPieces-totalPieces);
                    break;
                }else{
                    cutPieces = cutPieces+pieceSize;
                }
            }
        }
    }
}
