package arrays;
//Leetcode-1752

public class CheckIfArrayIsSortedAndRotated {
    public boolean check(int[] nums) {

        int n = nums.length;

        // Count number of places where
        // current element is greater than next element
        int count = 0;

        // Traverse circularly
        for (int i = 0; i < n; i++) {

            // Compare current element with next element
            // (i + 1) % n handles circular comparison
            if (nums[i] > nums[(i + 1) % n]) {

                count++;
            }
        }

        // For a sorted and rotated array,
        // there can be at most one decreasing point
        return count <= 1;
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)
