public class Fibonacci {
    // Main method
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to print
        System.out.println("First " + n + " numbers in the Fibonacci series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Recursive method to calculate Fibonacci numbers
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base cases: fibonacci(0) = 0 and fibonacci(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }
}
