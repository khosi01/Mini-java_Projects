package PracticeProjects;
import java.util.Scanner;
import java.util.Random;


public class DiceRollerProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Declare variables
        int numOfDice;
        int total = 0;


        //Get number of dice from user
        System.out.print("Enter the number of dice you want to roll: ");
        numOfDice = scanner.nextInt();

        // Check if # of dice > zero
        //roll all the dice
        //Get total

        if(numOfDice > 0){

            for(int i = 0; i < numOfDice; i++){
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("You rolled: " + roll);
                total += roll;
            }
            System.out.println("Total: " + total);

        } else {
         System.out.println("# of dice must be greater than 0");
        }




        scanner.close();
    }
    //Display ASCII of dice
    static void printDie(int roll) {
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;


        String dice2 = """
                 -------
                |●      |
                |       |
                |      ●|
                 -------
                """;

        String dice3 = """
                 -------
                |●      |
                |   ●   |
                |      ●|
                 -------
                """;

        String dice4 = """
                 -------
                |●     ●|
                |       |
                |●     ●|
                 -------
                """;

        String dice5 = """
                 -------
                |●     ●|
                |   ●   |
                |●     ●|
                 -------
                """;

        String dice6 = """
                 -------
                |●     ●|
                |●     ●|
                |●     ●|
                 -------
                """;

        switch (roll) {
            case 1 ->
                System.out.println(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("Invalid roll");
            }
        }
}
