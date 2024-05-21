// Vehicle class with maxSpeed and mileage attributes
public class Vehicle {
    // Attributes of the Vehicle class
    private int maxSpeed;
    private int mileage;

    // Constructor of the Vehicle class
    public Vehicle(int maxSpeed, int mileage) {
        this.maxSpeed = maxSpeed;
        this.mileage = mileage;
    }

    // Getter for maxSpeed
    public int getMaxSpeed() {
        return maxSpeed;
    }

    // Getter for mileage
    public int getMileage() {
        return mileage;
    }

    // Setter for maxSpeed
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // Setter for mileage
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    // Method to display vehicle information
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h, Mileage: " + mileage + " km");
    }

    public static void main(String[] args) {
        // Create an instance of Vehicle
        Vehicle vehicle = new Vehicle(180, 15000);
        // Display vehicle information
        vehicle.displayInfo();
    }
}
