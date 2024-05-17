import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user for their salary
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        // Asking user for their years of service
        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();

        double bonus = 0;

        // Check if years of service is more than 5 years to give a bonus
        if (yearsOfService > 5) {
            // Calculate 5% bonus
            bonus = salary * 0.05;
        }

        // Printing the bonus amount
        System.out.println("The bonus amount is: " + bonus);

        scanner.close();
    }
}
