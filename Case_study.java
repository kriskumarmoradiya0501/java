import java.util.Random;
import java.util.Scanner;

class Stone{
    Stone(){
        Scanner s = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"stone", "paper", "scissors"};

        int a=0;
        int user_p=0;
        int com_p=0;

        while (true) {

            System.out.println("Welcome to Stone-Paper-Scissors game!");
            System.out.println("Enter your choice: stone, paper, scissors , exit");

            System.out.print("Your choice: ");
            String user = s.next();


            int computerIndex = random.nextInt(3);
            String computer = choices[computerIndex];

            System.out.println("Computer's choice: " + computer);

            if (!user.equals("stone") && !user.equals("paper") && !user.equals("scissors")&& !user.equals("exit")) {
                System.out.println("Invalid choice.");
            }
            else if (user.equals(computer)) {
                System.out.println("Tie!");
            }
            else if ((user.equals("stone") && computer.equals("scissors")) ||
                    (user.equals("paper") && computer.equals("stone")) ||
                    (user.equals("scissors") && computer.equals("paper"))) {
                System.out.println("Congratulations! You win!");
                user_p++;
            } else if (user.equals("exit")) {
                break;
            } else {
                System.out.println("Computer wins!");
                com_p++;
            }
            a++;
        }
        System.out.println("Result : \n computer = "+com_p+" user = "+user_p);
    }
}

class Predict{
    Predict(){
        Scanner s = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"1", "2", "3","4", "5", "6","7", "8", "9","10","exit"};

        int a=0;
        int user_p=0;
        int com_p=0;

        while (true) {

            System.out.println("Welcome to Number Prediction Game!");
            System.out.println("Enter your choice: 1 to 10");

            System.out.print("Your choice: ");
            String user = s.next();


            int computerIndex = random.nextInt(10);
            String computer = choices[computerIndex];

            System.out.println("Computer's choice: " + computer);

            if (!user.equals("1") && !user.equals("2") && !user.equals("3") && !user.equals("4") && !user.equals("5") && !user.equals("6") && !user.equals("7") && !user.equals("8") && !user.equals("9") && !user.equals("10")) {
                System.out.println("Invalid choice.");
            }
            else if (user.equals(computer)) {
                System.out.println("You Are winner");
                user_p++;
            }
            else if (!user.equals(computer)) {
                System.out.println("You lose the game.");
                com_p++;
            }
            else if (user.equals("exit")) {
                break;
            }
            a++;
        }
        System.out.println("Result : \n computer = "+com_p+" user = "+user_p);
    }
}

public class Case_study {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter 1 if you want to play Stone,Paper,scissors Game.");
            System.out.println("Enter 2 if you want ton play Number Prediction Game.");
            System.out.println("Enter 3 if you want to exit.");
            System.out.println("Enter Your chice : ");
            int ch = sc.nextInt();

            if (ch == 1){
                Stone s = new Stone();
            } else if (ch == 2) {
                Predict p = new Predict();
            }
            else if (ch == 3){
                System.out.println("Visit Again");
                break;
            }
            else {
                System.out.println("Invalid Input");
            }
        }
    }
}
