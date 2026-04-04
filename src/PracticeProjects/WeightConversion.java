package PracticeProjects;
import java.util.Scanner;
public class WeightConversion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        //Declare variables
        double weight;
        double newWeight;
        int choice;

        //Welcome message
        System.out.println("====Weight Conversion Program====\n");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        //Prompt for user choice
        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        //option 1 convert lbs to kgs
        if (choice == 1) {
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();

            newWeight = weight * 0.453592;
            System.out.printf("Weight in kgs is %.1f\n", newWeight);
        }

        //option 2 convert kgs to lbs
        if (choice == 2) {
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();

            newWeight = weight * 2.20462;
            System.out.printf("Weight in lbs is %.1f\n", newWeight);
        }
        //else print not a valid choice
       else {
           System.out.print("That was not a valid choice. \n ");
        }
        scanner.close();
    }
}
