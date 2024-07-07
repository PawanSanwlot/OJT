// Write a java program to create and start two threads that print numbers from  1to 5

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
class B extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}

public class thread1 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start(); 
        b.start();
    }

}