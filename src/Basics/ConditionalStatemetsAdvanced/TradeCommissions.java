package src.Basics.ConditionalStatemetsAdvanced;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double basePrice = Double.parseDouble(scanner.nextLine());
        double commission = 0;

        switch (city) {
            case "Sofia":
                   if(basePrice>=0 && basePrice <= 500) {
                        commission = 0.05;
                       System.out.printf("%.2f", basePrice*commission);
                   }else if(basePrice>500 && basePrice <= 1000) {
                         commission = 0.07;
                       System.out.printf("%.2f", basePrice*commission);
                   }else if(basePrice>1000 && basePrice <= 10000) {
                       commission = 0.08;
                       System.out.printf("%.2f", basePrice*commission);
                   }else if(basePrice>10000){
                       commission = 0.12;
                       System.out.printf("%.2f", basePrice*commission);
                   }else {
                       System.out.println("error");
                   }
                   break;
            case "Plovdiv":
                       if(basePrice>=0 && basePrice <= 500) {
                           commission = 0.055;
                           System.out.printf("%.2f", basePrice*commission);
                       }else if(basePrice>500 && basePrice <= 1000) {
                           commission = 0.08;
                           System.out.printf("%.2f", basePrice*commission);
                       }else if(basePrice>1000 && basePrice <= 10000) {
                           commission = 0.12;
                           System.out.printf("%.2f", basePrice*commission);
                       }else if(basePrice>10000){
                           commission = 0.145;
                           System.out.printf("%.2f", basePrice*commission);
                       }else {
                           System.out.println("error");
                       }

                       break;
            case "Varna":
                      if(basePrice>=0 && basePrice <= 500) {
                       commission = 0.045;
                          System.out.printf("%.2f", basePrice*commission);
                      }else if(basePrice>500 && basePrice <= 1000) {
                          commission = 0.075;
                          System.out.printf("%.2f", basePrice*commission);
                      }else if(basePrice>1000 && basePrice <= 10000) {
                          commission = 0.10;
                          System.out.printf("%.2f", basePrice*commission);
                      }else if(basePrice>10000){
                          commission = 0.13;
                          System.out.printf("%.2f", basePrice*commission);
                      }else {
                          System.out.println("error");
                      }
                      break;
                      default:
                          System.out.println("error");
        }



    }
}
