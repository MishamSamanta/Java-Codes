import java.util.Scanner;

public class Enhance_switch{
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)){

            System.out.print("Enter a day: ");
            String day = scanner.nextLine();

            switch (day) {
                // case "Monday" -> System.out.println("This is not a weekend 😒");
                // case "Tuesday" -> System.out.println("This is not a weekend 😒");
                // case "Thursday" -> System.out.println("This is not a weekend 😒");
                // case "Friday" -> System.out.println("This is not a weekend 😒");
                // case "Saturday" -> System.out.println("This is not a weekend 😊");
                // case "Sunday" -> System.out.println("This is not a weekend 😊");

                // OR 

                case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                        System.out.println("This is not a weekday");
                case "Saturday", "Sunday" -> 
                        System.out.println("This is a weekday");
                default -> System.out.println(day + " doesn't exist");
            }
        }
    }
}