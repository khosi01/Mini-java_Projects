package com.notes.basics;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

   System.out.print("============nested if statements==============\n");

   boolean isStudent = true;
   boolean isSenior = true;
   double price = 9.99;

   if(isStudent){
     if(isSenior)
     {
       System.out.println("You get a senior discount of 20%");
       System.out.println("You get a student discount of 10%");
       price *= 0.7;
     } else {
       System.out.println("You get a student discount of 10%");
       price *= 0.9;
     }
   }

   else {
     if(isSenior) {
       System.out.println("You get a senior discount of 20%\n");
       price *= 0.8;

     }
   }

System.out.printf("The price of a ticket is R %.2f\n", price);

   System.out.print("\n================String methods=============\n");
    String name = "Cleo Diamond";
    char letter = name.charAt(0);
    int index = name.indexOf("o");
    int lastIndex = name.lastIndexOf("n");
    int length = name.length();

    System.out.println(length);
    System.out.println(letter);
    System.out.println(index);
    System.out.println(lastIndex);


    /* =====make all characters uppercase====
    * name = name.toUpperCase();
    * name = name.toLowerCase();
    */

    //=====to eliminate all white spaces====
    //name = name.trim();

    //=====to replace character with a different name=====
    // name = name.replace("o", "a");

    /* =====to see if a string is empty=====
    * name.isEmpty();
    *
    * if(name.isEmpty) {
      System.out.print("Your name is Empty");
    } else {
    System.out.print("Hello " + name);
    }
    */

/* =======if our string returns a character========
if (name.contains(" ")) {
System.out.println("Your name contains a space")
}
else {
System.out.println("Your name DOES NOT contain any spaces");
}
*/

    /* if(name.equalsIgnoreCase("cleo diamond")) {
    System.out.println("Your name cant be password");
    } else {
    System.out.println("Hello " + name);
    }
     */

    System.out.println("\n=========substrings============\n");
//.substring() = A method used to extract a portion of a string
//               .substring(start, end)

    String email;
    String username;
    String domain;

    System.out.print("Enter your email: ");
    email = scanner.next();

    if(email.contains("@")) {
      username = email.substring(0, email.indexOf("@"));
      domain = email.substring(email.indexOf("@") + 1);


      System.out.println(username);
      System.out.println(domain);
    } else {
      System.out.println("Emails must contain @");
    }

scanner.close();

  }

}

