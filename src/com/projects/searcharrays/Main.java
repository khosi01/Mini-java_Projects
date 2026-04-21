package com.projects.searcharrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //accepting user input



         int[] numbers = {1, 5, 7, 8, 9, 2};
        String[] fruits = {"apple", "orange", "grape", "banana"};
        //String target = "grape";
        //int target = 3; //number we are searching for
        boolean isFound = false;
        String target;

        System.out.print("Enter a fruit to search for: ");
        target = scanner.nextLine();

        //linear search

       /* for(int i = 0; i < numbers.length; i++){

            if(target == numbers[i]){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        */

        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target)){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }


        if(!isFound ) {
            System.out.println("Element not found in the array");
        }


        scanner.close();
    }

}
