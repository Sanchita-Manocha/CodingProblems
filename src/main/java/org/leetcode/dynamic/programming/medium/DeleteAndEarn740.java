package org.leetcode.dynamic.programming.medium;

import java.util.HashMap;
import java.util.Map;

/*
You are given an integer array nums. You want to maximize the number of points you get by performing the following operation any number of times:

Pick any nums[i] and delete it to earn nums[i] points. Afterwards, you must delete every element equal to nums[i] - 1 and every element equal to nums[i] + 1.
Return the maximum number of points you can earn by applying the above operation some number of times.
 */
public class DeleteAndEarn740 {
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int[] arr = new int[max + 1];
        for (int value : nums) {
            arr[value] += value;
        }
        Map<Integer, Integer> mem = new HashMap<>();
        return deleteAndEarnRec(arr, 1, mem);
    }

    private int deleteAndEarnRec(int[] arr, int n, Map<Integer, Integer> mem) {
        if(n>=arr.length)
            return 0;
        if(!mem.containsKey(n)){
        int take = arr[n] + deleteAndEarnRec(arr, n+2, mem);
        int skip = deleteAndEarnRec(arr, n+1, mem);
        mem.put(n,Math.max(take, skip));
        }
        return mem.get(n);
    }
    public int deleteAndEarn1(int[] nums) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int[] arr = new int[max + 1];
        for (int value : nums) {
            arr[value] += value;
        }
        int[] dp = new int[arr.length+1];
        dp[0]=arr[0];
        dp[1]=arr[1];
        for(int i=2; i<arr.length;i++){
            dp[i]=Math.max(dp[i-2]+arr[i], dp[i-1]);
        }
        return dp[arr.length-1];
    }
}