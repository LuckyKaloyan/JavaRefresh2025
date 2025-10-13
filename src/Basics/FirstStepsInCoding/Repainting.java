package src.Basics.FirstStepsInCoding;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylonSqm = Integer.parseInt(scanner.nextLine());
        int paintLiters = Integer.parseInt(scanner.nextLine());
        int thinnerLiters = Integer.parseInt(scanner.nextLine());
        int workHours = Integer.parseInt(scanner.nextLine());

        double sumNylon = nylonSqm * 1.50 + 3;
        double sumPaint = paintLiters * 1.10 * 14.5;
        double sumThinner = thinnerLiters * 5;

        double totalSumMaterials = sumNylon + sumPaint + sumThinner + 0.4;
        double salaries = totalSumMaterials*0.3*workHours;

        System.out.println(totalSumMaterials+salaries);



    }
}
