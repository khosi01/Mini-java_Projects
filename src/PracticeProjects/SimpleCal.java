package PracticeProjects;
import java.util.Scanner;

public class SimpleCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //declare values
        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperator = true;

        //Enter first number
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();
        //Choose operator
        System.out.print("Enter operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);
        //Enter second number
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        //calculate

        switch(operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0) {
                    System.out.println("Cannot divide by zero");
                    validOperator = false;
                } else  {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator");
                validOperator = false;
            }
        }
        if(validOperator) {
            System.out.println(result);
        }

        scanner.close();
    }
}
