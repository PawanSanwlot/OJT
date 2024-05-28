import java.util.Scanner;

public class Calculator {

    // Static method for addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Static method for subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Static method for multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Static method for division
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return num1 / num2;
    }

    // Main method to test the Calculator class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Input second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Input operation
        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        // Perform the operation and display the result
        double result = 0;
        try {
            switch (operation) {
                case '+':
                    result = add(num1, num2);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    break;
                case '/':
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operation. Please enter +, -, *, or /.");
                    return;
            }
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
