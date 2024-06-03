import java.util.Scanner;
public class GradeEvaluator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your score");
        int score = scanner.nextInt();
        if(score >=90){
            System.out.println("Your grade is A");
        }
        else if(score>=80){
            System.out.println("Your grade is B");
        }
        else if( score>=70){
            System.out.println("Your grade is C");
        }
        else if( score>=50){
            System.out.println("Your grade is D");
        }
        else if( score>=40){
            System.out.println("Your grade is F");
        }
        else if( score>=20){
            System.out.println("Your grade is E");
        }
        else{
            System.out.println("Enter Correct Value");
        }
    }
}
