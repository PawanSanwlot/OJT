// Define the Shape interface
interface Shape {
    void draw();
}

// Implement the Circle class
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Implement the Square class
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

// Implement the Triangle class
class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}

// Main class to demonstrate the functionality
public class ShapeDemo {
    public static void main(String[] args) {
        // Create an array of Shape references
        Shape[] shapes = new Shape[3];
        
        // Initialize the array with different shapes
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Triangle();
        
        // Call the draw() method on each shape
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
