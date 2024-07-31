class ToyCar {
    String color;
    int speed;

    // Constructor
    ToyCar(String c, int s) {
        color = c; // Set the color
        speed = s; // Set the speed
    }
}

public class Test {
    public static void main(String[] args) {
        // Create a new toy car with color "red" and speed 10
        ToyCar myCar = new ToyCar("red", 10);

        System.out.println("Color: " + myCar.color);
        System.out.println("Speed: " + myCar.speed);
    }
}
