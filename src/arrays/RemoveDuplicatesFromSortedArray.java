package arrays;
//Leetcode-26
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;

        // Edge case
        if (n == 0) {
            return 0;
        }

        // Pointer for unique elements
        int k = 1;

        // Traverse array
        for (int i = 1; i < n; i++) {

            // If current element is unique
            if (nums[i] != nums[i - 1]) {

                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

}
//Time Complexity: O(n)
//Space Complexity: O(1)
