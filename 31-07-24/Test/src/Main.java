class Calculator {
    // Method to add two numbers
    int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two numbers
    int multiply(int a, int b) {
        return a * b;
    }

    double remender(int a, int b){
        if (b !=0){
            return(double) a%b;
        } else{
          System.out.println("Division by zero is not allowed.");
          return 0;   
        }
    }
    
    // Method to divide two numbers
    double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the Calculator class
        Calculator calculator = new Calculator();

        // Call methods on the calculator object
        int sum = calculator.add(5, 3);
        int difference = calculator.subtract(5, 3);
        int mutiplication = calculator.multiply(5, 3);
        double quotient = calculator.divide(60, 6);
        double remender = calculator.remender(60, 6);

        // Print the results
        System.out.println("Sum: " + sum);
        System.out.println("Subtract : " + difference);
        System.out.println("Multiplication: " + mutiplication);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remender: " + remender );
    }
}
