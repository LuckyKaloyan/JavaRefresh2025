package src.Basics.FirstStepsInCoding;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = Double.parseDouble(scanner.nextLine());
        double shoes = 0.6*price;
        double shorts = shoes*0.8;
        double ball = 0.25*shorts;
        double accessories = ball*0.20;

        double total = price + shoes + accessories + shorts + ball;

        System.out.println(total);

    }
}
