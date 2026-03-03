import java.util.Scanner;

public class ternary_operator {
    public static void main(String[] args) {
        
        // turnary operator ? = Returns 1 of 2 values if the conditon is ture 
        // variable = (condition)? ifTure : ifFalse;

        try (Scanner scanner = new Scanner(System.in)){
            
            int marks;
            
            System.out.print("Enter your marks: ");
            marks = scanner.nextInt();

            String passOrFail = (marks >=60) ? "PASS" : "FAIL";

            System.out.println("You are " + passOrFail);
    }
        }
        
}
