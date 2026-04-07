package com.notes.loops;
import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // break = break out of a loop(STOP)
        //continue = skip current iteration of a loop (SKIP)

        /*
        for(int i = 0;i < 10;i++){
            if(i == 5) {
                break;
            }

            System.out.print(i + "");
        }
        */

        //nested loop = A loop inside another loop
        //              Used often with matrices of DSA
        //              can be a combination of for loops or while loops

      /*  for(int i = 1;i <= 3;i++) {
            for (int j = 1; j <= 9; i++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
*/

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbol = scanner.next().charAt(0);
        for(int i = 0; i < rows; i++) {
         for(int j = 0; j < columns; j++) {

            System.out.print(symbol);
        }
         System.out.println();
         }

        scanner.close();
    }
}
