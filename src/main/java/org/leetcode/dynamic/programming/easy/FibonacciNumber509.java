package org.leetcode.dynamic.programming.easy;

public class FibonacciNumber509 {

    public int fib(int n) {
        int[] mem = new int[n+1];
        return fib(n, mem);
    }

    public int fib(int n, int[] mem) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (mem[n] == 0)
            mem[n] = fib(n - 1, mem) + fib(n - 2, mem);
        return mem[n];
    }

    public int fib1(int n) {
        int[] dp = new int[n+1];
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
