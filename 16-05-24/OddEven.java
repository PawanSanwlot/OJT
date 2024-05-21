import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
         // Create a logic for odd even
         // import scanner class
          Scanner scanner = new Scanner(System.in);
          // take input from user
          int number = scanner.nextInt();
         // give result
         if(number % 2 == 0) {
            System.out.println(number +" is even");
         } else {
            System.out.println(number + " is odd");
         }
    }   
}
// notes

// 1. first of all make a class
// 2. use psvm shortcut for making basic structure of java program
// 3. use sout shortcut for print command
// 4. to get user input, import java.util.Scanner and
// make the instance of the Scanner class in the main function
// ex: Scanner scanner = new Scanner(System.in)
