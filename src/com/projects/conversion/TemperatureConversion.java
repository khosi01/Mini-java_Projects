package com.projects.conversion;
import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //°F = °C * 9/5 + 32
        //°C = (°F - 32) * 5/9


        //Declare variables
        double temperature;
        double newTemperature;
        String unit;




        // prompt user to enter temperature
        System.out.print("Enter the temperature: ");
        temperature = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();


        //Convert Celsius to Fahrenheit & vise versa


         newTemperature = (unit.equals("C")) ? (temperature - 32) * 5 / 9 : (temperature * 5 / 9) + 32;
         System.out.printf("%.1f° %s", newTemperature, unit);





        scanner.close();
    }
}
