package com.notes.arrays;

import java.util.Scanner;

public class twodarrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // 2D array = An array where each element is an array
        //            Useful for storing a matrix of data



       /* String[][] groceries = {{"apple", "orange", "grape"},
                                {"potato", "onion", "carrot"},
                                {"chicken", "pork", "beef", "fish"}};


        groceries[0][2] = "banana";
        // groceries[row][col];

        for(String[] foods : groceries) {
            for(String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }

        */


        char[][] telephone = {{'1', '2', '3'},
                              {'4', '5', '6'},
                              {'7', '8', '9'},
                              {'*', '0', '#'}};


        for(char[] row : telephone){
            for(char number : row){
                System.out.print(number + " ");

            }
         System.out.println();
        }
        sc.close();
    }
}
