import java.util.Scanner;

public class RockPaperScissors {

    static Scanner input = new Scanner(System.in);
    //main method is only the game loop
    public static void main(String[] args) {
        String tryAgain = "yes";
        while (tryAgain.toLowerCase().equals("yes")) {
            tryAgain = doSingleRound();
        }
    }

    //Do a single round of Rock Paper Scissors, returning the user's choice to play again.
    public static String doSingleRound() {
        System.out.println("One round of Rock, Paper, Scissors!");
        String choice = "";
        do {
            if (!choice.equals("")) {
                System.out.println("Invalid selection, try again!");
            }
            System.out.println("Do you want to throw Rock, Paper, or Scissors?");
            choice = input.nextLine();
        } while (!choice.toLowerCase().equals("rock") && !choice.toLowerCase().equals("paper") && !choice.toLowerCase().equals("scissors") );
        int aiChoice = (int)Math.floor(Math.random()) * 3;
        if (aiChoice == 0) {
            declareWinner(choice.toLowerCase(), "rock");
        }
        else if (aiChoice == 1) {
            declareWinner(choice.toLowerCase(), "paper");
        }
        else {
            declareWinner(choice.toLowerCase(), "scissors");
        }
        System.out.println("Do you want to play again? Yes or No");
        return input.nextLine();
    }

    //Declare the winner of the match
    public static void declareWinner(String userChoice, String aiChoice) {
        if (userChoice == "rock" ) {
            if (aiChoice.equals("rock")) {
                System.out.println("Your opponent threw Rock! It's a tie!");
            }
            else if (aiChoice.equals("paper")) {
                System.out.println("Your opponent threw Paper! You lose!");
            }
            else if (aiChoice.equals("scissors")) {
                System.out.println("Your opponent threw Scissors! You win!");
            }
        }
        else if (userChoice == "paper") {
            if (aiChoice.equals("rock")) {
                System.out.println("Your opponent threw Rock! You win!");
            }
            else if (aiChoice.equals("paper")) {
                System.out.println("Your opponent threw Paper! It's a tie!");
            }
            else if (aiChoice.equals("scissors")) {
                System.out.println("Your opponent threw Scissors! You lose!");
            }
        }
        else if (userChoice == "scissors") {
            if (aiChoice.equals("rock")) {
                System.out.println("Your opponent threw Rock! You lose!");
            }
            else if (aiChoice.equals("paper")) {
                System.out.println("Your opponent threw Paper! You win!");
            }
            else if (aiChoice.equals("scissors")) {
                System.out.println("Your opponent threw Scissors! It's a tie!");
            }
        }
    }
}
