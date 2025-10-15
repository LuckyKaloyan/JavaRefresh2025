package src.Basics.ConditionalStatemetsAdvanced;

import java.util.Scanner;

public class FruitOrVeggie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input) {
            case "apple":
            case "banana":
                case "cherry":
                    case "grapes":
                        case "kiwi":
                            case "lemon":
                                System.out.println("fruit");
                                break;
                                case "tomato":
                                    case "cucumber":
            case "pepper":
                case "carrot":
                    System.out.println("vegetable");
                    break;
                    default:
                        System.out.println("unknown");

        }




    }
}
