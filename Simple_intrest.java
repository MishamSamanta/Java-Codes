import java.util.Scanner;

public class Simple_intrest {
    public static void main(String[] args) {
        
        try(Scanner scanner = new Scanner(System.in)){

            System.out.print("Enter the principal amount: ");
            double principal = scanner.nextDouble();

            System.out.print("Enter the rate of interest (in percentage): ");
            double rate = scanner.nextDouble();

            System.out.print("Enter the time period (in years): ");
            double time = scanner.nextDouble();

            // Calculate simple interest
            double simpleInterest = (principal * rate * time) / 100;

            System.out.println("The simple interest is: " + simpleInterest);
            System.out.println("Hey their what's up");
        }
        
    }
}
