package com.notes.basics;

import java.util.Scanner;
public class EnhancedSwitches {
    public static void main(String[] args) {
Scanner scanner =  new Scanner(System.in);
        //Enhanced switch = A replacement to many else if statements

       String day;

       System.out.print("Enter the day of the week: ");
       day = scanner.nextLine();

       switch(day){
           case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
               System.out.print("It is a weekday ");
           case "Saturday", "Sunday" ->
                   System.out.println("It is a weekend");
           default -> System.out.println(day + " is not a day");
       }
        scanner.close();
    }
}
