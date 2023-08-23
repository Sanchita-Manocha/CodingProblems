package org.leetcode.array.easy;

public class RichestCustomerWealth1672 {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) {
            int totalWealth = account[0];
            for (int j = 1; j < account.length; j++) {
                totalWealth += account[j];
            }
            maxWealth = Math.max(totalWealth, maxWealth);
        }
        return maxWealth;
    }
}
