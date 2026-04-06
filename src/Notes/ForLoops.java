package Notes;
import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) throws InterruptedException {
Scanner scanner =  new Scanner(System.in);

        //for Loop = execute code a CERTAIN amount of times
        //         for(declare; condition; update (increnemt/decrement)
        // i is used as a counter
        // condition = when would we want to stop
        //Increment/decrement

        /*
        runs the program 10 times
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(i);
        }

         */


        /* System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for(int i = 1; i <= max; i++) {
            System.out.print(i);
        }

         */

        System.out.print("========Simulating a countdown====================\n");

        System.out.print("How many seconds to countdown from?: ");
        int start = scanner.nextInt();

        for(int i = start; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
}
System.out.println("HAPPY NEW YEAR!");



        scanner.close();
    }
}
