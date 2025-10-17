package src.Basics.NestedLoops;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juryCount = Integer.parseInt(scanner.nextLine());
        boolean isFinshed = false;
        double total = 0;
        int totalMarksCount = 0;

        while(!isFinshed){
            String projectName = scanner.nextLine();
            double projectTotal = 0;
            if(projectName.equals("Finish")){
                isFinshed = true;
                System.out.printf("Student's final assessment is %.2f.",total/totalMarksCount);
                break;
            }
            for (int i = 0; i < juryCount; i++) {
                  double value = Double.parseDouble(scanner.nextLine());
                  projectTotal += value;
                  total += value;
                  totalMarksCount += 1;
            }
            System.out.printf("%s - %.2f.\n",projectName,projectTotal/juryCount);

        }

    }
}
