
import java.util.Random;
import java.util.Scanner;

public class search_array {

    public static void main(String[] args) {
        find_number();
        find_fruit();
    }

    // Changed return type from 'int' to 'void'
    // static void find_number() {
    //     Random random = new Random(); // this is too long code 
    //     int a = random.nextInt(1, 100);
    //     int b = random.nextInt(1, 100);
    //     int c = random.nextInt(1, 100);
    //     int d = random.nextInt(1, 100);
    //     int e = random.nextInt(1, 100);
    //     int f = random.nextInt(1, 100);
    //     int[] numbers = {a, b, c, d, e, f};
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("Enter a number to search: "); // Added for better UX
    //     int target = scanner.nextInt();
    //     boolean isFound = false;
    //     for (int i = 0; i < numbers.length; i++) {
    //         if (target == numbers[i]) {
    //             System.out.println("The element has been found at index " + i);
    //             isFound = true;
    //             break;
    //         }
    //     }
    //     if (!isFound) {
    //         System.out.println("The element doesn't exist");
    //     }
    // } 
    static void find_number() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // 1. Declare an empty array of size 6
        int[] numbers = new int[6];

        // 2. Use a loop to automatically populate it with random numbers
        System.out.print("Generated hidden numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1, 100);
            System.out.print(numbers[i] + " "); // Optional: prints them so you can test easily
        }
        System.out.println(); // Just a blank line for formatting

        System.out.print("Enter a number to search: ");
        int target = scanner.nextInt();
        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                System.out.println("The element has been found at index " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("The element doesn't exist");
        }

    }

    // Changed return type from 'String' to 'void'
    static void find_fruit() {
        // Fixed the typo "orragne" -> "orange"
        String[] fruits = {"apple", "orange", "banana"};

        String fruitTarget = "mango";
        boolean isFruit = false;

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(fruitTarget)) {
                System.out.println("The element found at index " + i);
                isFruit = true;
                break;
            }
        }

        if (!isFruit) {
            System.out.println("The element doesn't exist");
        }
    }
}
