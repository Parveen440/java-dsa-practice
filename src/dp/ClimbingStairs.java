package dp;

public class ClimbingStairs {
    public int climbStairs(int n) {
        // handle base cases
        if (n <= 2) {
            return n;
        }
        int dp[] = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        // fill DP array
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
