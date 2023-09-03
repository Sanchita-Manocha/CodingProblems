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
}
////        int sum = 0;
////        for (int i = 0; i < nums.length; i++) {
////            sum = Math.max(sum, deleteAndEarn(nums, i));
////        }
////        return sum;
//        // find max number
//        int maxNum = 0;
//        for(int n: nums) {
//            maxNum = Math.max(n, maxNum);
//        }
//
//        // initialize 1-d memorization array
//        int[] A = new int[maxNum+1];
//
//        for(int n: nums) {
//            A[n] += n;
//        }
//        // update dp array
//        for(int i=2; i<A.length; i++) {
//            A[i] = Math.max(A[i-2] + A[i], A[i-1]);
//        }
//        return A[A.length-1];
//    }
//
//    private int deleteAndEarn(int[] nums, int index) {
//        int value = nums[index];
//        int sum = value;
//        nums[index] = 0;
//        for (int num : nums) {
//            if (num != value - 1 && num != value + 1)
//                sum += num;
//        }
//        return sum;
//    }
//}
