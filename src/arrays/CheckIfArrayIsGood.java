package arrays;
//leetcode - 2784

import java.util.*;

public class CheckIfArrayIsGood {

    public boolean isGood(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length - 1;
        //largest element should be n
        if (nums[n] != n) {
            return false;
        }
        // last two elements should be equal
        if (nums[n] != nums[n - 1]) {
            return false;
        }

        // check 1 to n-1 should appear only once
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != i + 1) {
                return false;
            }
        }

        return true;
    }
}

// Time Complexity: O(n log n)
// Space Complexity: O(1) excluding sorting space

