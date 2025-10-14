package src.Basics.ConditionalStatements;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        if(figure.equals("square")){
            double side = Double.parseDouble(scanner.nextLine());
            double area = side*side;
            System.out.println(area);
        }else if(figure.equals("rectangle")){
            double side1 = Double.parseDouble(scanner.nextLine());
            double side2 = Double.parseDouble(scanner.nextLine());
            double area = side1*side2;
            System.out.println(area);
        }else if(figure.equals("circle")){
            double side1 = Double.parseDouble(scanner.nextLine());
            double area = side1*side1*Math.PI;
            System.out.println(area);
        }else if(figure.equals("triangle")){
            double side = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            double area = side*height/2;
            System.out.println(area);
        }
    }
}
