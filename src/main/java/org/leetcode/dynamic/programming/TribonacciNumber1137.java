package org.leetcode.dynamic.programming;

public class TribonacciNumber1137 {
    /*    T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
     Given n, return the value of Tn.
     */
    public int tribonacci(int n, int[] mem) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        if (mem[n] == 0)
            mem[n] = tribonacci(n - 3, mem) + tribonacci(n - 2, mem) + tribonacci(n - 1, mem);
        return mem[n];
    }
    public int tribonacci(int n) {
        int[] mem = new int[n+1];
        return tribonacci(n, mem);
    }

    public int tribonacci1(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] =dp[2]=1;
        for(int i=3; i<=n; i++){
            dp[i]=dp[i-3]+dp[i-2]+dp[i-1];
        }
        return dp[n];
    }
}
