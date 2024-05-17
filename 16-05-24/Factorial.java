import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Calculate factorial using iterative approach
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Print the result
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
