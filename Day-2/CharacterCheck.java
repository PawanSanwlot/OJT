import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user to enter a character
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Checking if the character is lowercase or uppercase
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("The character is lowercase.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("The character is uppercase.");
        } else {
            System.out.println("The character is neither lowercase nor uppercase.");
        }

        scanner.close();
    }
}
