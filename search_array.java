
import java.util.Random;
import java.util.Scanner;

public class search_array {

    public static void main(String[] args) {
        find_number();
        find_fruit();
    }

    // Changed return type from 'int' to 'void'
    static void find_number() {

        Random random = new Random();
        int a = random.nextInt(1, 100);
        int b = random.nextInt(1, 100);
        int c = random.nextInt(1, 100);
        int d = random.nextInt(1, 100);
        int e = random.nextInt(1, 100);
        int f = random.nextInt(1, 100);

        int[] numbers = {a, b, c, d, e, f};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to search: "); // Added for better UX
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
