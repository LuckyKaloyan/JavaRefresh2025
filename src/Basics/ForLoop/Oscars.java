    package src.Basics.ForLoop;

    import java.util.Scanner;

    public class Oscars {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String actorsName = scanner.nextLine();
            double academyScore = Double.parseDouble(scanner.nextLine());
            int judgesCount = Integer.parseInt(scanner.nextLine());


            for (int i = 0; i < judgesCount; i++) {
                String judgeName = scanner.nextLine();
                double score = Double.parseDouble(scanner.nextLine());
                academyScore += (score*judgeName.length())/2;
                if(academyScore>=1250.5){
                    System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorsName, academyScore);
                    break;
                }
            }
            if(academyScore<1250.5){
                System.out.printf("Sorry, %s you need %.1f more!", actorsName, 1250.5-academyScore);
            }
        }
    }
