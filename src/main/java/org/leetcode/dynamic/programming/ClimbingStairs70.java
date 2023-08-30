package org.leetcode.dynamic.programming;

public class ClimbingStairs70 {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public int climbStairs1(int n) {
        int[] memo = new int[n + 1];
        return climbStairs1(n, memo);
    }

    public int climbStairs1(int n, int[] memo) {
        if (n == 1 || n == 2)
            return n;
        if (memo[n] == 0) {
            memo[n] = climbStairs1(n - 1, memo) + climbStairs1(n - 2, memo);
        }
        return memo[n];

    }
}
