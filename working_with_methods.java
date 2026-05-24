
import java.util.Scanner;

public class working_with_methods {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        double result = square(n);
        System.out.printf("The square is %f\n", result);
        
    }

    static double square(double number){
        return number * number;
    }
}
