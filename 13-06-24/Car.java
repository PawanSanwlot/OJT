// Define the Vehicle interface
interface Vehicle {
    void move();
}

// Define the Engine interface
interface Engine {
    void start();
}

// Implement the Car class
class Car implements Vehicle, Engine {
    // Implement the move method from Vehicle interface
    public void move() {
        System.out.println("The car is moving");
    }

    // Implement the start method from Engine interface
    public void start() {
        System.out.println("The car's engine is starting");
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.move();
    }
}
