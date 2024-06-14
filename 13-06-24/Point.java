public final class Point {
    // Private final fields
    private final int x;
    private final int y;

    // Constructor to initialize the fields
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter method for x
    public int getX() {
        return x;
    }

    // Getter method for y
    public int getY() {
        return y;
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Create an instance of Point
        Point point = new Point(5, 10);

        // Display the values using getter methods
        System.out.println("Point coordinates: (x = " + point.getX() + ", y = " + point.getY() + ")");
    }
}
