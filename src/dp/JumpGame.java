package dp;
//Leetcode-55

public class JumpGame {
    public boolean canJump(int[] nums) {
        int n = nums.length;

        // dp[i] = can reach end from index i
        boolean dp[] = new boolean[n];

        // Last index can always reach itself
        dp[n - 1] = true;

        // Traverse from right to left
        for (int i = n - 2; i >= 0; i--) {

            // Check all possible jumps
            for (int jump = 1; jump <= nums[i]; jump++) {

                // Next reachable index
                int nextIndex = i + jump;

                // If next index can reach end
                if (nextIndex < n && dp[nextIndex]) {

                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[0];
    }

}
//Time Complexity:  O(n²)
//Space Complexity: O(n)
