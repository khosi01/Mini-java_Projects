package com.notes.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Arrays = a collection of values of the same data type
         *           think of it as a variable that can store more than 1 value
         */

        String[] fruits = {"Apple", "Orange", "Banana", "Pear"};

        // fruits[0] = "Pineapple";
       // int numOfFruits = fruits.length;
       // Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapple");

      /* for(int i = 0; i <fruits.length; i++){
            System.out.println(fruits[i]);
            //System.out.print(fruits[i] + " ");
            }


        System.out.println(fruits[0]);
        System.out.println(numOfFruits);
        */

        //Enhanced For Loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        scanner.close();
    }
}
