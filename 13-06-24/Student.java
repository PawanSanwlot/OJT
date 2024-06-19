public class Student {
    // Private fields
    private String name;
    private int age;
    private char grade;

    // Default constructor
    public Student() {
        this.name = "Pavan";
        this.age = 16;
        this.grade = 'A'; // 'U' for undefined
    }

    // Constructor with name parameter
    public Student(String name) {
        this.name = name;
        this.age = 20;
        this.grade = 'B';
    }

    // Constructor with name and age parameters
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 'B';
    }

    // Constructor with name, age, and grade parameters
    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Getter method for grade
    public char getGrade() {
        return grade;
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Using different constructors to create Student objects
        Student student1 = new Student();
        Student student2 = new Student("Shibnu");
        Student student3 = new Student("Hari", 20);
        Student student4 = new Student("Moorthy", 22, 'C');

        // Displaying the values using getter methods
        System.out.println("Student 1: Name = " + student1.getName() + ", Age = " + student1.getAge() + ", Grade = "
                + student1.getGrade());
        System.out.println("Student 2: Name = " + student2.getName() + ", Age = " + student2.getAge() + ", Grade = "
                + student2.getGrade());
        System.out.println("Student 3: Name = " + student3.getName() + ", Age = " + student3.getAge() + ", Grade = "
                + student3.getGrade());
        System.out.println("Student 4: Name = " + student4.getName() + ", Age = " + student4.getAge() + ", Grade = "
                + student4.getGrade());
    }
}
