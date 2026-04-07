package com.projects.shopping;
import java.util.Scanner;

public class SimpleShoppingCart {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     int quantity;
     double price;
     char currency = 'R';
     double total;

     System.out.print("What item would you like to buy?: ");
     String item = sc.nextLine();

     System.out.print("What is the price for each?: ");
     price = sc.nextDouble();

     System.out.print("How many would you like to buy?: ");
     quantity = sc.nextInt();

     total = price * quantity;

     System.out.println("You have bought " + quantity +" "+ item + "/s");
        total = (float) (quantity * price);
        System.out.println("Your total is " + currency + total);

    sc.close();
}}
