package src.Basics.ConditionalStatements;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double score = Double.parseDouble(scanner.nextLine());
        double bonus = 0;
        if (score <= 100) {
            bonus = 5;
        }
        if (score>100){
            bonus = 0.2*score;
        }
        if (score>1000){
            bonus = 0.1*score;
        }
        if(score%5 == 0 && score%10 != 0){
            bonus+=2;
        }else if(score%2 ==0){
            bonus+=1;
        }
        System.out.println(bonus);
        System.out.println(score+bonus);
    }
}
