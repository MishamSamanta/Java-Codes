import java.util.InputMismatchException;
import java.util.Scanner;

public class attendence_calc {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close the scanner
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("=== Professional Attendance Tracker ===");
            
            // The "Try" block handles potential input errors
            System.out.print("Enter total classes held: ");
            int totalClasses = sc.nextInt();
            
            System.out.print("Enter classes attended: ");
            int attendedClasses = sc.nextInt();
            
            System.out.print("Enter your target % (e.g., 75): ");
            double target = sc.nextDouble();

            // Simple logic check: You can't attend more classes than held
            if (attendedClasses > totalClasses) {
                System.out.println("Error: Attended classes cannot exceed total classes.");
                return;
            }

            double currentPercentage = ((double) attendedClasses / totalClasses) * 100;
            System.out.printf("\nYour current attendance is: %.2f%%\n", currentPercentage);

            if (currentPercentage >= target) {
                int canMiss = 0;
                // Calculate how many more can be missed
                while (((double) attendedClasses / (totalClasses + canMiss + 1)) * 100 >= target) {
                    canMiss++;
                }
                System.out.println("Status: Safe. You can miss " + canMiss + " more classes.");
            } else {
                int needed = 0;
                int tempAttended = attendedClasses;
                int tempTotal = totalClasses;
                // Calculate how many more to attend
                while (((double) tempAttended / tempTotal) * 100 < target) {
                    tempAttended++;
                    tempTotal++;
                    needed++;
                }
                System.out.println("Status: Shortage. Attend the next " + needed + " classes.");
            }

        } catch (InputMismatchException e) {
            // This runs if the user enters text instead of a number
            System.err.println("Invalid Input! Please enter numbers only.");
        } catch (ArithmeticException e) {
            // This runs if there's a math error (like dividing by zero)
            System.err.println("Mathematical error occurred.");
        } catch (Exception e) {
            // Catch-all for any other unexpected issues
            System.err.println("Something went wrong: " + e.getMessage());
        }
    }
}