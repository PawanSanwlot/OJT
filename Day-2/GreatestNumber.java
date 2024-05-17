import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the first integer
        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();

        // Taking input for the second integer
        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();

        // Finding and printing the greatest number
        if (firstNumber > secondNumber) {
            System.out.println("The greatest number is: " + firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println("The greatest number is: " + secondNumber);
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}
