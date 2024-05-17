import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculating absolute value
        int absoluteValue = Math.abs(number);

        // Printing the absolute value
        System.out.println("The absolute value is: " + absoluteValue);

        scanner.close();
    }
}
