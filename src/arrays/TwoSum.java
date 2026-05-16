package arrays;
//Leetcode-1
import java.util.*;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            // Find required complement
            int ele = target - nums[i];

            // Check if complement already exists
            if (mp.containsKey(ele)) {

                // Return indices
                return new int[]{i, mp.get(ele)};
            }

            // Store current element and index
            mp.put(nums[i], i);
        }

        // Return empty array if no solution exists
        return new int[]{};
    }
}
// Time Complexity: O(n)
// Space Complexity: O(n)