package com.notes.basics;

import java.util.Scanner;

public class VariableScope {

    static int x = 3; //CLASS

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // variable scope = where a variable can be accessed
        //local scope

        int x = 1; //LOCAL
       System.out.println(x);

       doSomething();

        scanner.close();

    }
    static void doSomething() {
        int x = 2;//LOCAL
        System.out.println(x);
}
}
