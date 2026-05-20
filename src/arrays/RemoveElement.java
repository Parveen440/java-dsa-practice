package arrays;
//Leetcode-27
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int start = 0;
        // Traverse array
        for (int i = 0; i < nums.length; i++) {
            // Keep only non-val elements
            if (nums[i] != val) {
                nums[start] = nums[i];
                start++;
            }
        }
        return start;
    }
}
//Time Complexity: O(n)
//Space Complexity: O(1)
