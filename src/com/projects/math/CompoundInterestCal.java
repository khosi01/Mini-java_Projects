package com.projects.math;
import java.util.Scanner;


public class CompoundInterestCal {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            //Compound interest formula - A = P [1 + r/n]^nt

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;


        System.out.print("Enter the principal amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = sc.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = sc.nextInt();

        System.out.print("Enter the # of years: ");
        years = sc.nextInt();

        amount = principal* Math.pow(1 + rate /  timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d years is $%.2f\n", years, amount);
            sc.close();
    }
}
