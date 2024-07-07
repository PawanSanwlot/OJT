class Individual{
    //attributes
    private String name ;
    private int age;

    //constructor
    public Individual (String name, int age){
        this.name = name;
        this.age = age;
    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class Person{
    public static void main(String[] args) {
        Individual Individual1 = new Individual("Pavan", 24);
        Individual1.displayInfo();  
    }
}



