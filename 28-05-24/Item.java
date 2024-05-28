public class Item {
    private String itemId;
    private String name;
    private int quantity;
    private double price;

    // Constructor
    public Item(String itemId, String name, int quantity, double price) {
        this.itemId = itemId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Method to update the quantity
    public void updateQuantity(int amount) {
        this.quantity += amount;
        if (this.quantity < 0) {
            this.quantity = 0; // Ensure quantity does not go negative
        }
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: $" + price);
    }

    // Getter for item ID
    public String getItemId() {
        return itemId;
    }

    // Main method to test the Item class
    public static void main(String[] args) {
        // Create an instance of Item
        Item item = new Item("A001", "Laptop", 10, 999.99);

        // Display item details
        item.displayItemDetails();

        // Update the quantity (add 5)
        item.updateQuantity(5);
        System.out.println("\nAfter adding 5 units:");
        item.displayItemDetails();

        // Update the quantity (subtract 12)
        item.updateQuantity(-12);
        System.out.println("\nAfter subtracting 12 units:");
        item.displayItemDetails();
    }
}
