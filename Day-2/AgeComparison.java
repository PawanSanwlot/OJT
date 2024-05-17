import java.util.Scanner;

public class AgeComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the ages of three people
        System.out.print("Enter the age of the first person: ");
        int age1 = scanner.nextInt();

        System.out.print("Enter the age of the second person: ");
        int age2 = scanner.nextInt();

        System.out.print("Enter the age of the third person: ");
        int age3 = scanner.nextInt();

        // Determine the oldest age
        int oldest = age1;
        if (age2 > oldest) {
            oldest = age2;
        }
        if (age3 > oldest) {
            oldest = age3;
        }

        // Determine the youngest age
        int youngest = age1;
        if (age2 < youngest) {
            youngest = age2;
        }
        if (age3 < youngest) {
            youngest = age3;
        }

        // Printing the results
        System.out.println("The oldest age is: " + oldest);
        System.out.println("The youngest age is: " + youngest);

        scanner.close();
    }
}
