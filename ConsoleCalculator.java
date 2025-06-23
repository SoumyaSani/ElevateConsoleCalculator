package intenship;

import java.util.Scanner;

public class ConsoleCalculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("Welcome to Console Calculator!");

        while (keepRunning) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            double num1 = 0, num2 = 0, result = 0;

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();

                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
            }

            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    result = divide(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 5:
                    keepRunning = false;
                    System.out.println("Thank you for using the calculator!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
