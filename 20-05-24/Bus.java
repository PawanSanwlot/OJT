// Bus class that inherits from Class_Inherite (Vehicle)
public class Bus extends Class_Inherite {
    // Attribute specific to Bus
    private int capacity;

    // Constructor of the Bus class with default capacity of 50
    public Bus(int maxSpeed, int mileage) {
        super(maxSpeed, mileage);
        this.capacity = 50; // Default seating capacity
    }

    // Constructor of the Bus class with specified capacity
    public Bus(int maxSpeed, int mileage, int capacity) {
        super(maxSpeed, mileage);
        this.capacity = capacity;
    }

    // Getter for capacity
    public int getCapacity() {
        return capacity;
    }

    // Setter for capacity
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // Method to display bus information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo method of the Vehicle class
        System.out.println("Seating Capacity: " + capacity);
    }

    public static void main(String[] args) {
        // Create an instance of Bus with default capacity
        Bus bus1 = new Bus(120, 10000);
        bus1.displayInfo(); // Output will include default capacity of 50

        // Create an instance of Bus with specified capacity
        Bus bus2 = new Bus(100, 20000, 60);
        bus2.displayInfo(); // Output will include specified capacity of 60
    }
}
