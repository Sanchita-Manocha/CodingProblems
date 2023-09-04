package org.leetcode.dynamic.programming.medium;

import java.util.HashMap;
import java.util.Map;

/*
There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]).
The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]).
The robot can only move either down or right at any point in time.

Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.

The test cases are generated so that the answer will be less than or equal to 2 * 109.
 */
public class UniquePaths62 {
    public int uniquePaths(int m, int n) {
        int[][] mem = new int[m + 1][n + 1];
        return uniquePaths(0, 0, m, n, mem);
    }

    private int uniquePaths(int rowIndex, int columnIndex, int m, int n, int[][] mem) {
        if (rowIndex >= m || columnIndex >= n)
            return 0;
        if (rowIndex == m - 1 && columnIndex == n - 1)
            return 1;
        if (mem[rowIndex][columnIndex] == 0) {
            int down = uniquePaths(rowIndex + 1, columnIndex, m, n, mem);
            int right = uniquePaths(rowIndex, columnIndex + 1, m, n, mem);
            mem[rowIndex][columnIndex] = down + right;
        }
        return mem[rowIndex][columnIndex];
    }
}
