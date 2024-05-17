import java.util.Scanner;

public class ShopDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user for the quantity
        System.out.print("Enter the quantity of units purchased: ");
        int quantity = scanner.nextInt();

        // Assuming one unit costs 100
        int unitCost = 100;
        int totalCost = quantity * unitCost;

        // Check if the total cost exceeds 1000 to apply discount
        if (totalCost > 1000) {
            // Apply 10% discount
            double discount = totalCost * 0.50;
            totalCost -= discount;
            System.out.println("A discount of 10% has been applied.");
        }

        // Printing the total cost
        System.out.println("The total cost is: " + totalCost);

        scanner.close();
    }
}
