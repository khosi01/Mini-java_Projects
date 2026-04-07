package com.notes.methods;
import java.util.Scanner;

public class OverloadedMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //overloaded methods = methods that share the same name,
        //                     but different parameters
        //                     signature = name + parameters

       String pizza = bakePizza("flat bread", "mozzarella", "Pepperoni");
       System.out.println(pizza);


        scanner.close();
    }
static String bakePizza(String bread)   {
        return bread + "pizza";
}
    static String bakePizza(String bread, String cheese)   {
        return cheese +" "+ bread + "pizza";
    }
    static String bakePizza(String bread, String cheese, String topping)   {
        return topping+ " " + cheese+ " " + bread + "pizza";
    }
}
