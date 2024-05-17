import java.util.Scanner;

public class ModulusOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the divisor
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Check for valid divisor
        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
            scanner.close();
            return;
        }

        // Input the number of terms
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Input the numbers and perform modulus operation
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Close the scanner
        scanner.close();

        // Calculate and print the modulus of each number
        System.out.println("Modulus results:");
        for (int i = 0; i < n; i++) {
            int modulus = numbers[i] % divisor;
            System.out.println(numbers[i] + " % " + divisor + " = " + modulus);
        }
    }
}
