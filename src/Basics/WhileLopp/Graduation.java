package src.Basics.WhileLopp;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int fails = 0;
        int grade = 0;
        double totalSum = 0;

        while (fails < 2 && grade < 12 ) {
            double currentGrade = Double.parseDouble(scanner.nextLine());
            if (currentGrade < 4) {
             fails++;
             if(fails==2){
                 System.out.printf("%s has been excluded at %d grade",name,grade);
             }
            }
            totalSum += currentGrade;
            grade++;
            if(grade ==12){
                System.out.printf("%s graduated. Average grade: %.2f",name,totalSum/12);
            }
        }

    }
}
