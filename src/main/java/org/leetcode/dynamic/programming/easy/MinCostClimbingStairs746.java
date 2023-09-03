package org.leetcode.dynamic.programming.easy;

public class MinCostClimbingStairs746 {
    public int minCostClimbingStairs(int[] cost) {
        int[] mem = new int[cost.length + 1];
        return Math.min(minCostClimbingStairs(cost, 0, mem), minCostClimbingStairs(cost, 1,mem));
    }

    public int minCostClimbingStairs(int[] cost, int n, int[] mem) {
        if (n == cost.length - 1 || n == cost.length - 2)
            return cost[n];
        if(mem[n] == 0)
            mem[n]= cost[n] + Math.min(minCostClimbingStairs(cost, n + 1,mem), minCostClimbingStairs(cost, n + 2, mem));
        return mem[n];
    }

    public int minCostClimbingStairs1(int[] cost) {
        int[] dp = new int[cost.length + 1];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i = 2; i < cost.length; i++){
            dp[i]=Math.min(dp[i-1], dp[i-2])+cost[i];
        }
        return Math.min(dp[cost.length-1],dp[cost.length-2]);
    }
    public int minCostClimbingStairs2(int[] cost) {
        int n = cost.length;
        return Math.min(minCost2(cost, n-1), minCost2(cost, n-2));
    }
    private int minCost2(int[] cost, int n) {
        if (n < 0) return 0;
        if (n==0 || n==1) return cost[n];
        var value = cost[n] + Math.min(minCost2(cost, n-1), minCost2(cost, n-2));
        return value;
    }
}