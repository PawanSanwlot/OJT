class car {
    String color;
    String model;

    void display() {
        System.out.println("model" + model + " " + ",color" + color);
    }
}

public class Main {
    public static void main(String[] args) {
        car car = new car();
        car.color = "red";
        car.model = "BMW";
        car.display();
    }
}