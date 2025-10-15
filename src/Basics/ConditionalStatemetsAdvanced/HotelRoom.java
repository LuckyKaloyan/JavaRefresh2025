package src.Basics.ConditionalStatemetsAdvanced;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double studioPrice = 0.00;
        double apartmentPrice = 0.00;
        double studioDiscount = 1;
        double apartmentDiscount = 1;

        switch (month) {
            case "May": case "October":
                studioPrice = 50.00;
                apartmentPrice = 65.00;
                if(nights>7 && nights<=14){
                    studioDiscount = 0.95;
                }else if(nights>14){
                    studioDiscount = 0.70;
                    apartmentDiscount = 0.90;
                }break;
            case "June": case "September":
                studioPrice = 75.20;
                apartmentPrice = 68.70;
                if(nights>7 && nights<=14){
                    studioDiscount = 0.95;
                }else if(nights>14){
                    studioDiscount = 0.80;
                    apartmentDiscount = 0.90;
                }break;
            case "July": case "August":
                studioPrice = 76.00;
                apartmentPrice = 77.00;
               if(nights>14){
                    apartmentDiscount = 0.90;
                }break;

        }

        System.out.printf("Apartment: %.2f lv.\n", apartmentPrice*apartmentDiscount*nights);
        System.out.printf("Studio: %.2f lv.\n", studioPrice*studioDiscount*nights);





    }
}
