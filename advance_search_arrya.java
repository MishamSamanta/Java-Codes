
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;

/**
 * Custom Exception to handle business logic failures gracefully.
 */
class ElementNotFoundException extends Exception {

    public ElementNotFoundException(String message) {
        super(message);
    }
}

public class advance_search_arrya {

    public static void main(String[] args) {
        executeOptimizedNumberSearch();
        System.out.println("\n" + "=".repeat(40) + "\n");
        executeFruitSearch();
    }

    /**
     * Highly Optimized Binary Search Algorithm. Time Complexity: O(log n) |
     * Space Complexity: O(1)
     *
     * * @param array Sorted array to search through
     * @param target The integer value to find
     * @return The index of the element
     * @throws ElementNotFoundException if the element is missing
     */
    public static int binarySearch(int[] array, int target) throws ElementNotFoundException {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            // Prevents potential integer overflow bug compared to (low + high) / 2
            int mid = low + (high - low) / 2;
            int midVal = array[mid];

            if (midVal < target) {
                low = mid + 1;
            } else if (midVal > target) {
                high = mid - 1;
            } else {
                return mid; // Target found
            }
        }
        throw new ElementNotFoundException("Target value " + target + " was not found in the dataset.");
    }

    /**
     * Demonstrates high-performance numeric searching over sorted random data.
     */
    private static void executeOptimizedNumberSearch() {
        Random random = new Random();

        // Stream-generate 15 unique sorted random numbers
        int[] numbers = random.ints(15, 1, 100).distinct().sorted().toArray();

        System.out.println("[SYSTEM INFO] Initialized Sorted Dataset: " + Arrays.toString(numbers));

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter target integer to evaluate: ");
            if (!scanner.hasNextInt()) {
                System.err.println("[ERROR] Invalid input stream state. Expected Integer.");
                return;
            }

            int target = scanner.nextInt();

            // Execute search and handle the outcome
            int resultIndex = binarySearch(numbers, target);
            System.out.printf("[SUCCESS] Element found inside memory cluster at index: %d%n", resultIndex);

        } catch (ElementNotFoundException e) {
            System.err.println("[REGISTRY NOTICE] " + e.getMessage());
        }
    }

    /**
     * Demonstrates linear search on Objects using modern Functional Stream
     * Closures.
     */
    private static void executeFruitSearch() {
        String[] fruits = {"apple", "banana", "mango", "orange"};
        String targetFruit = "mango";

        System.out.println("[SYSTEM INFO] Scanning Target Cluster: " + Arrays.toString(fruits));

        // Using streams to cleanly match and perform actions via functional Consumers
        Arrays.stream(fruits)
                .filter(fruit -> fruit.equalsIgnoreCase(targetFruit))
                .findFirst()
                .ifPresentOrElse(
                        handleSuccess(targetFruit, fruits),
                        handleFailure(targetFruit)
                );
    }

    // Helper Functional Callback for Success Handling
    private static Consumer<String> handleSuccess(String target, String[] array) {
        return fruit -> System.out.printf("[SUCCESS] '%s' verified at positional registry index: %d%n",
                target, Arrays.asList(array).indexOf(fruit));
    }

    // Helper Functional Callback for Failure Handling
    private static Runnable handleFailure(String target) {
        return () -> System.err.printf("[ERROR] Object Reference '%s' is missing from the cluster.%n", target);
    }
}
