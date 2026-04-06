package PracticeProjects;
import java.util.Scanner;

public class BankingProgram {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Declare variables
        double balance = 0;
        boolean isRunning = true;
        int choice;


while(isRunning) {
            //Display menu
            System.out.println("\n=============================");
            System.out.println("Welcome to Banking Program");
            System.out.println("=============================");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("==============================\n");

            System.out.print("Enter your choice (1 - 4): ");
            choice = scanner.nextInt();


            //Get and process users choice
            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }
        //Exit message
        System.out.println("==============================");
        System.out.println("Thank you for using Banking Program, Have a nice day!");
        System.out.println("==============================\n");

        scanner.close();
    }
        //create a method of show balance()
        static void showBalance(double balance) {
        System.out.println("==============================");
        System.out.printf("R%.2f\n", balance);
        }

        //Create a method to deposit()
     static double deposit() {

        double amount;

        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount cannot be negative");
            return 0;
        } else {
           return amount;
        }


     }

        //Create a method to withdraw()
    static double withdraw(double balance) {
        double amount;
        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if (amount > balance ) {
            System.out.println("INSUFFICIENT BALANCE");
            return 0;

        } else if (amount < 0) {
            System.out.println("Amount cannot be negative");
            return 0;
        } else {
            return amount;
        }
    }



}
