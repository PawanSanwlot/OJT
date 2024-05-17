import java.util.Scanner;

public class AttendanceCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user for the number of classes held
        System.out.print("Enter the number of classes held: ");
        int classesHeld = scanner.nextInt();

        // Asking user for the number of classes attended
        System.out.print("Enter the number of classes attended: ");
        int classesAttended = scanner.nextInt();

        // Calculating the attendance percentage
        double attendancePercentage = ((double) classesAttended / classesHeld) * 100;

        // Printing the attendance percentage
        System.out.println("Percentage of classes attended: " + attendancePercentage + "%");

        // Asking if the student has a medical cause
        System.out.print("Do you have a medical cause? (Y/N): ");
        char medicalCause = scanner.next().charAt(0);

        // Determining if the student is allowed to sit in the exam
        if (attendancePercentage >= 75 || medicalCause == 'Y' || medicalCause == 'y') {
            System.out.println("The student is allowed to sit in the exam.");
        } else {
            System.out.println("The student is not allowed to sit in the exam.");
        }

        scanner.close();
    }
}
