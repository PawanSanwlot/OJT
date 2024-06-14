public class MathOperations {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three numbers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add four numbers
    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // Main method to demonstrate method overloading
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        // Add two numbers
        int sum2 = mathOps.add(5, 10);
        System.out.println("Sum of 5 and 10: " + sum2);

        // Add three numbers
        int sum3 = mathOps.add(5, 10, 15);
        System.out.println("Sum of 5, 10, and 15: " + sum3);

        // Add four numbers
        int sum4 = mathOps.add(5, 10, 15, 20);
        System.out.println("Sum of 5, 10, 15, and 20: " + sum4);
    }
}
