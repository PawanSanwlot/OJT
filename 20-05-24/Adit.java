public class Adit {
    // Attributes of the class
    private String name;
    private String phoneNumber;

    // Method to store the name and phone number
    public void storeDetails(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Method to print out the name and phone number
    public void printDetails() {
        System.out.println("Name: " + name + ", Phone Number: " + phoneNumber);
    }

    public static void main(String[] args) {
        // Create an instance of the Adit class
        Adit adit = new Adit();

        // Store details in the instance
        adit.storeDetails("Pavan Sanwlot", "7890-123-456");

        // Print out the stored details
        adit.printDetails();
    }
}
