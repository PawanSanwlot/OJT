import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter a series of integers (enter a negative number to stop):");

        while (true) {
            int number = scanner.nextInt();

            // Check if the entered number is negative
            if (number < 0) {
                break;
            }

            // Add the entered number to the sum
            sum += number;
        }

        System.out.println("The sum of the entered numbers is: " + sum);
        scanner.close();
    }
}
