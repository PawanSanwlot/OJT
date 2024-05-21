import java.util.ArrayList;
import java.util.List;

public class Inventory {
    // Collection of products
    private List<Product> products;

    // Constructor
    public Inventory() {
        this.products = new ArrayList<>();
    }

    // Method to add a product to the inventory
    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " has been added to the inventory.");
    }

    // Method to remove a product from the inventory
    public void removeProduct(Product product) {
        if (products.remove(product)) {
            System.out.println(product.getName() + " has been removed from the inventory.");
        } else {
            System.out.println(product.getName() + " is not in the inventory.");
        }
    }

    // Method to check for low inventory
    public void checkLowInventory(int threshold) {
        System.out.println("Products with inventory below " + threshold + ":");
        for (Product product : products) {
            if (product.getQuantity() < threshold) {
                System.out.println(product);
            }
        }
    }

    // Method to display all products in the inventory
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("The inventory is empty.");
        } else {
            System.out.println("Products in the inventory:");
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    // Main method to test the Inventory class
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Create some products
        Product product1 = new Product("Laptop", 10, 999.99);
        Product product2 = new Product("Smartphone", 5, 499.99);
        Product product3 = new Product("Headphones", 20, 29.99);

        // Add products to the inventory
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        // Display all products in the inventory
        inventory.displayProducts();

        // Check for low inventory with a threshold of 10
        inventory.checkLowInventory(10);

        // Remove a product from the inventory
        inventory.removeProduct(product2);

        // Display all products in the inventory again
        inventory.displayProducts();
    }
}
