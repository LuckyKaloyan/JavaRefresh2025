package src.Basics.WhileLopp;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int failLimit = Integer.parseInt(scanner.nextLine());
        int failedTimes = 0;
        int scoreTotal = 0;
        int taskCounter = 0;
        String lastProblem = "";

        while (failedTimes < failLimit) {
            String task = scanner.nextLine();

            if(task.equals("Enough")){
                double averageScore = (double)scoreTotal/ (double)taskCounter;
                System.out.printf("Average score: %.2f\n", averageScore);
                System.out.printf("Number of problems: %d\n", taskCounter);
                System.out.printf("Last problem: %s",lastProblem);
                break;
            }
            int taskScore = Integer.parseInt(scanner.nextLine());
            if(taskScore <= 4){
                failedTimes++;
            }
            if(failedTimes == failLimit){
                System.out.printf("You need a break, %d poor grades.",failedTimes);
            }
            lastProblem = task;
            scoreTotal += taskScore;
            taskCounter++;

        }

    }
}
