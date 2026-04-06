package Notes;
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
 System.out.print("============Logical operators============\n");
        Scanner scanner = new Scanner(System.in);

        // && = AND
        // || = OR
        // ! = NOT

        double temp = 30;
        boolean isSunny = true;

        if(temp <= 30 && temp >=0 && isSunny) {
            System.out.println("The weather is good");
            System.out.println("It is SUNNY outside");
        } else if(temp <= 30 && temp >=0 && !isSunny) {
            System.out.println("The weather is good");
            System.out.println("It is CLOUDY outside");
        } else if(temp > 30 || temp < 0) {
            System.out.println("The weather is bad");
        }

        //username must be between 4-12 characters
        //username must not contain spaces or underscores

        String username;

        System.out.print("Enter your new username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12 ) {
            System.out.println("Username mus be between 4 - 12 characters");
        }
        else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain spaces or underscores");
        }
        else {
            System.out.println("Welcome " + username);

        }

        System.out.print("\n===========While Loops============\n");
        // While loop = repeat some code forever
        //              while some condition remains true

        String name = " ";

        while(name.isEmpty()) {
            System.out.print("Enter your name: ");
            name=scanner.nextLine();
        }

        System.out.print("Hello " + name);

        //game
        String response = "";

        while(!response.equals("Q")) {
            System.out.print("You are playing a game");
            System.out.println("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }

        //ask user for age

        int age = 0;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while(age < 0) {
            System.out.println("Your age can't be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }

        System.out.print("You are " + age + " years old");

        System.out.print("\n==============do-while loops=================\n");
// with do-while loops ( do -> condition first, while -> check the condition after)
        int number = 0;

        do {
            System.out.print("Enter your number between 1-10: ");
            number = scanner.nextInt();
        }
        while(number <1 || number > 10);

        System.out.print("You picked " + number);
        scanner.close();

    }

}
