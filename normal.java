import java.util.HashMap;
import java.util.Map;

public class normal {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the value and its index
        // Key: The number, Value: The index of that number in the array
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the "partner" number needed to reach the target is in the map
            if (numMap.containsKey(complement)) {
                // If found, return the index of the partner and current index
                return new int[] { numMap.get(complement), i };
            }

            // If not found, add the current number and its index to the map
            numMap.put(nums[i], i);
        }

        // Return an empty array if no solution is found
        return new int[] {};
    }

    public static void main(String[] args) {
        normal solver = new normal();
        
        // Test Case
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = solver.twoSum(nums, target);
        
        if (result.length == 2) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
            System.out.println("Numbers: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
        } else {
            System.out.println("No pair found.");
        }
    }
} 
    

