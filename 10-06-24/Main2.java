class animal {
    void eat() {
        System.out.println("The dog eat cat");
    }
}

class Dog extends animal {
    void bark() {
        System.out.println("Dog is nothing");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }   
}