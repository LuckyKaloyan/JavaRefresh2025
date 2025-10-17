package src.Basics.NestedLoops;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isFinished = false;
        double totalTickets = 0;
        double student = 0;
        double standard = 0;
        double kid = 0;

        while (!isFinished) {
            String movieName = scanner.nextLine();
            if (movieName.equals("Finish")) {
                isFinished = true;
                break;
            }
            double emptyPlaces = Double.parseDouble(scanner.nextLine());
            double usedPlaces = 0;

            while (usedPlaces < emptyPlaces) {
                String seat = scanner.nextLine();

                if (seat.equals("End")) {
                    break;
                }

                usedPlaces++;
                totalTickets++;

                if (seat.equals("student")) {
                    student++;
                } else if (seat.equals("standard")) {
                    standard++;
                } else if (seat.equals("kid")) {
                    kid++;
                }
            }

            System.out.printf("%s - %.2f%% full.%n", movieName, usedPlaces * 100.0 / emptyPlaces);
        }

        System.out.printf("Total tickets: %.0f%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", student * 100.0 / totalTickets);
        System.out.printf("%.2f%% standard tickets.%n", standard * 100.0 / totalTickets);
        System.out.printf("%.2f%% kids tickets.%n", kid * 100.0 / totalTickets);
    }
}
