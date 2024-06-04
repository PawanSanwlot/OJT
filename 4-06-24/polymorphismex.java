//Polymorphism - overloading example

class example {
    public void display() {
        System.out.println("Method without parameter");
    }

    public void display(int a) {
        System.out.println("Method with single parameter:" + a);
    }

    public void display(int a, int b) {
        System.out.println("Method with two parameters:" + a + "," + b);
    }

    public void display(double a, double b) {
        System.out.println("Method with different data types:" + a + "," + b);
    }

    public void display(double x, int y, String z) {
        System.out.println("Method with mix datatypes:" + x + "," + y + "," + z);
    }
}

public class polymorphismex {
    public static void main(String[] args) {
        example ex = new example();
        ex.display(5, 4);
        ex.display(1.3, 8, "Joe");
        ex.display();
    }
}