
import java.util.Scanner;

public class HCF {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            int a;
            int b;
            System.out.print("Enter First number: ");
            a = scanner.nextInt();
            System.out.print("Enter another number: ");
            b = scanner.nextInt();

            if (a > b) {
                while (b != 0) { // Loop until the remainder is 0
                    int temp = b;
                    b = a % b;    // b becomes the remainder
                    a = temp;     // a becomes the previous divisor
                }
                System.out.println("The HCF is: " + a);
            } 
            else {
                // Tip: You can swap a and b here so the code works even if a < b!
                System.out.println("Enter a first number larger than the second, or add swap logic.");
            }

        }
    }
}
