package com.notes.methods;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //method = a block of reusable code that is executed when called ()

        String name = "Cleo";
        int age = 25;

        happyBirthday(name, age);

        double result = square(3);
        System.out.println(result);

        String fullName = "SpongeBob SquarePants";
        System.out.println(fullName);

       if(ageCheck(age)) {
           System.out.println("You may sign up");

       } else {
           System.out.println("You must be 18+ to sign up");
       }



        scanner.close();
    }

    static void happyBirthday(String name,  int age) {
        System.out.println("Happy birthday to you");
        System.out.printf("Happy birthday dear %s!\n", name);
        System.out.printf("You are %d years old\n", age);
        System.out.println("Happy birthday to you\n");

    }
    static double square(double number) {
        return number * number;
}
    static double cube(double number) {
        return number * number * number;
}
    static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
    static boolean ageCheck(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
