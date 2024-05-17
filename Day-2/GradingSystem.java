import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user for their marks
        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();

        // Determining the grade based on the marks
        char grade;
        if (marks < 25) {
            grade = 'F';
        } else if (marks >= 25 && marks < 45) {
            grade = 'E';
        } else if (marks >= 45 && marks < 50) {
            grade = 'D';
        } else if (marks >= 50 && marks < 60) {
            grade = 'C';
        } else if (marks >= 60 && marks < 80) {
            grade = 'B';
        } else if (marks >= 80) {
            grade = 'A';
        } else {
            grade = 'X'; // This should never happen given the above conditions
        }

        // Printing the grade
        System.out.println("Your grade is: " + grade);

        scanner.close();
    }
}
