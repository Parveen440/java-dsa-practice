package arrays;
//Leetcode : 2574
public class LeftAndRightSumDifference {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum -= nums[i]; // right sum
            res[i] = Math.abs(leftSum - totalSum);
            leftSum += nums[i];
        }
        return res;
    }
}
// Time Complexity: O(n)
// Space Complexity: O(n)
