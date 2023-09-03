package org.leetcode.dynamic.programming.medium;


import java.util.HashMap;
import java.util.Map;

/*
You are a professional robber planning to rob houses along a street.
Each house has a certain amount of money stashed,
the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected
and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house,
return the maximum amount of money you can rob tonight without alerting the police.
 */
public class HouseRobber198 {
    public int rob(int[] nums) {
        Map<Integer,Integer> mem = new HashMap<>();
        return rob(nums, 0, mem);
    }

    public int rob(int[] nums, int n, Map<Integer, Integer> mem) {
        if (mem.containsKey(n))
            return mem.get(n);
        if (n >= nums.length)
            return 0;
        mem.put(n,Math.max(nums[n] + rob(nums, n + 2, mem), rob(nums, n + 1, mem)));
        return mem.get(n);
    }
}
