class Vehicle {
    private String vehicle;

    public Vehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public void display() {
        System.out.println("Vehicle : " + vehicle);
    }
}

class Car extends Vehicle {
    private String brand;

    public Car(String vehicle, String brand) {
        super(vehicle);
        this.brand = brand;
    }

    public void displayBrand() {
        System.out.println(" Brand: " + brand);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("luxury");
        vehicle.display();

        Car car = new Car("Car", "Toyota-suppra");
        car.display(); 
        car.displayBrand(); 
    }
}