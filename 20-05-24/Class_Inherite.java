// Vehicle class with maxSpeed and mileage attributes
public class Class_Inherite {
    // Attributes of the Vehicle class
    private int maxSpeed;
    private int mileage;

    // Constructor of the Vehicle class
    public Class_Inherite(int maxSpeed, int mileage) {
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
}
