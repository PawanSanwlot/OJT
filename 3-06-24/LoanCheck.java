import java.util.Scanner;
public class LoanCheck {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your age: ");
    int age = scanner.nextInt();
    System.out.println("Enter your Income: ");
    int income = scanner.nextInt();
    if(age > 35 && income >=75000){
        System.out.println("You are Eligible for large loan");
    }
    else if(age <=35 && income >= 50000){
        System.out.println("You are eligible for medium loan");
    }
    else if(age <=25 && income >= 25000 && age>=18 ){
        System.out.println("You are eligible for small loan");
    }
    else{
        System.out.println("You are not elligible");
    }
    scanner.close();
    }
}
