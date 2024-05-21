import java.time.LocalDate;
import java.time.Period;

public class Employee {
    // Attributes of the Employee class
    private String name;
    private double salary;
    private LocalDate hireDate;

    // Constructor of the Employee class
    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter for hireDate
    public LocalDate getHireDate() {
        return hireDate;
    }

    // Setter for hireDate
    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    // Method to calculate years of service
    public int calculateYearsOfService() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(hireDate, currentDate).getYears();
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Hire Date: " + hireDate);
        System.out.println("Years of Service: " + calculateYearsOfService());
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Create an instance of Employee
        Employee employee = new Employee("Pavan", 900000, LocalDate.of(2024, 9, 20));

        // Display the employee information
        employee.displayInfo();
    }
}
