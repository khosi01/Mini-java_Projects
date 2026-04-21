package com.projects.games;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
Random random =new Random();

        //DECLARE VARIABLES
        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            //GET CHOICE FROM USER
            System.out.print("Enter your move (Rock Paper Scissors!): ");
            playerChoice=scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") && !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice.");
                continue;

            }

            //GET RANDOM CHOICE FROM THE COMPUTER
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            //CHECK WIN CONDITIONS
            if(playerChoice.equals(computerChoice)) {
                System.out.println("Its a tie");

            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    playerChoice.equals("scissors") && computerChoice.equals("paper")){
                System.out.println("You Win!");

            } else {
                System.out.println("You lose");
            }
            //ASK TO PLAY AGAIN
            System.out.print("Play again: (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();


        } while(playAgain.equals("yes"));

        //GOODBYE MESSAGE

        System.out.println("Thanks for playing!");

        scanner.close();
    }
}
