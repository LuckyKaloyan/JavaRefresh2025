package src.Basics.WhileLopp;
import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       double inputRare = Double.parseDouble(scanner.nextLine());
        int input = (int)(inputRare*100);
        int times = 0;
        while (input > 0) {
            if (input >= 200) {
                input -= 200;
                times++;
            }else if (input >= 100) {
                input -= 100;
                times++;
            }else if (input >= 50){
                input -= 50;
                times++;
            }else if (input >= 20){
                input -= 20;
                times++;
            }else if (input >= 10){
                input -= 10;
                times++;
            }else if (input >= 5){
                input -= 5;
                times++;
            }else if (input >= 2){
                input -= 2;
                times++;
            }else if (input >= 1){
                input -= 1;
                times++;
            }
        }
        if(input==0){
            System.out.println(times);
        }
    }
}