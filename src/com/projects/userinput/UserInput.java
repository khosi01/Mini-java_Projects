package com.projects.userinput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // String[] foods = new String[3];
        String[] foods;
        int size;

        System.out.println("How many foods do you want? ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for( int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        /* foods[0] = "pizza";
        * foods[1] = "burger";
        * foods[2] = "taco";
        */

        for(String food : foods){
                System.out.println(food);
        }

        scanner.close();
    }
}
