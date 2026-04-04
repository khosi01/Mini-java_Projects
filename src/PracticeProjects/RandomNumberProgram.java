package PracticeProjects;

import java.util.Random;

public class RandomNumberProgram {
    public static void main(String[] args) {
        Random random = new Random();

        //----Random numbers 1 to 5------
        //int number;
        //number = random.nextInt(1, 6);
        // System.out.println(number);

        //---generates a decimal number-----
        //double number;
        //number = random.nextDouble();
        //System.out.println(number);

        //-----useful when we flip a coin------
        boolean isHeads;
        isHeads = random.nextBoolean();

        if (isHeads) {
            System.out.println("HEADS");
        }
        else {
            System.out.println("TAILS");
        }

    }
}
