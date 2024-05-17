import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of terms
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int n = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Check for valid input
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Print the Fibonacci sequence
            System.out.println("Fibonacci sequence up to " + n + " terms:");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
    }

    // Method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
