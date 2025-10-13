package src.Basics.FirstStepsInCoding;

import java.util.Scanner;

public class ProjectCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int projectsNumber = Integer.parseInt(scanner.nextLine());
        int totalHoursNeeded = projectsNumber * 3;
        System.out.println("The architect " + name + " will need " + totalHoursNeeded+ " hours to complete " + projectsNumber + " project/s.");
    }
}
