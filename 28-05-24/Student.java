import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentId;
    private String name;
    private int age;
    private List<Double> grades;

    // Constructor
    public Student(String studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.grades = new ArrayList<>();
    }

    // Method to add a grade
    public void addGrade(double grade) {
        grades.add(grade);
    }

    // Method to update a grade at a specific index
    public void updateGrade(int index, double grade) {
        if (index >= 0 && index < grades.size()) {
            grades.set(index, grade);
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grades: " + grades);
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        // Create an instance of Student
        Student student = new Student("S001", "Pavan Sanwlot", 24);

        // Add grades
        student.addGrade(85.5);
        student.addGrade(90.0);
        student.addGrade(78.3);

        // Display student information
        student.displayStudentInfo();

        // Update a grade
        student.updateGrade(1, 92.5);
        System.out.println("\nAfter updating grade at index 1:");
        student.displayStudentInfo();

        // Attempt to update a grade with an invalid index
        student.updateGrade(5, 88.0);
    }
}
