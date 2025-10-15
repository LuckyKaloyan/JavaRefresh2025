package src.Basics.ConditionalStatemetsAdvanced;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());
        int examTime = examHour * 60 + examMinute;
        int arrivalTime = arrivalHour * 60 + arrivalMinute;

        if(examTime!=arrivalTime){
            if (examTime > arrivalTime) {
                if (examTime - arrivalTime <=30) {
                    System.out.println("On time");
                    System.out.printf("%d minutes before the start",examTime-arrivalTime);
                }else {
                    System.out.println("Early");
                    if(examTime-arrivalTime <60){
                        System.out.printf("%d minutes before the start",examTime-arrivalTime);
                    }else{
                        if(examTime-arrivalTime >=60 && examTime-arrivalTime%60>=10) {
                            System.out.printf("%d:%d hours before the start",((examTime-arrivalTime)/60),((examTime-arrivalTime)%60));
                        }else{
                            System.out.printf("%d:0%d hours before the start",((examTime-arrivalTime)/60),((examTime-arrivalTime)%60));
                        }
                    }
                }
            }else {
                System.out.println("Late");
                if(arrivalTime-examTime < 60){
                    System.out.printf("%d minutes before the start",arrivalTime-examTime);
                }else{
                    if(arrivalTime-examTime >=60 && arrivalTime-examTime%60>=10) {
                        System.out.printf("%d:%d hours before the start",((arrivalTime-examTime)/60),((arrivalTime-examTime)%60));
                    }else{
                        System.out.printf("%d:0%d hours before the start",((arrivalTime-examTime)/60),((arrivalTime-examTime)%60));
                    }
                }
            }
        }
    }
}