package com.projects.math;
import java.util.Scanner;

public class MathProgram {
    public static void main(String[] args) {

        //System.out.println(Math.PI);
        //System.out.println(Math.E); Exponential constant

        System.out.print("------------Math Class---------------\n");
        double result;
         result = Math.pow(2, 3);
        //result = Math.abs(-5); //absolute value
       //result = Math.sqrt(9); //square root
        //result = Math.round(3.14); // round off
        // result = Math.ceil(3.14); //round up
         //result = Math.floor(3.14); //round down
        // result = Math.max(10, 20);
        // result = Math.min(5, 10);
        System.out.println(result);

        System.out.print( "\n --------HYPOTENUSE c = Math.sqrt(a² + b²)--------\n");
        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = sc.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = sc.nextDouble();


        c = Math.sqrt(Math.pow(a, 2) +  Math.pow(b, 2));

        System.out.printf("The hypotenuse (side c) is %.1fcm \n" , c);



        System.out.print("\n-----------Simple Exercise------------------\n");
        //Circumference = 2 * Math.PI * radius
        // area = Math.PI * Math.pow(radius, 2)
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius :");
        radius = sc.nextDouble();

        circumference = 2  * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The circumference of the circle is: %.1fcm \n", + circumference);
        System.out.printf("The area of the circle is: %.1fcm² \n", + area);
        System.out.printf("The volume of the circle is: %.1fcm³ \n", + volume);


        System.out.print("\n--------------------using printf statements-----------------\n");
        //printf() = is a method used to format output
        //%[flags][width][.precision][specifier-character]

        String name = "Spongebob"; //s
        char firstLetter ='S'; //c
        int age = 25; //d
        double height = 60.5; //f
        boolean isEmployed = true; //b


        System.out.printf("Hello %s \n", name);
        System.out.printf("Your name starts with a %c \n", firstLetter);
        System.out.printf("You are %d years old \n", age);
        System.out.printf("You are %.1f inches tall \n", height);
        System.out.printf("Employed: %b \n", isEmployed);

        //[flags]
        // + = output a plus example : %+.1f
        //, = comma grouping separator: %,.2f
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive (good for aligning numbers)

        //[width]
        // 0 - zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%4d \n", id1);
        System.out.printf("%4d \n", id2);
        System.out.printf("%4d \n", id3);
        System.out.printf("%4d \n", id4);











        sc.close();
    }

}
