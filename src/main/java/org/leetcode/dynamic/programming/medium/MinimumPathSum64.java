package org.leetcode.dynamic.programming.medium;
/*
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.
 */
public class MinimumPathSum64 {
    public int minPathSum(int[][] grid) {
        int [][] mem = new int[grid.length+1][grid[0].length+1];
        return minPathSum(grid, 0, 0, mem);
    }
    private int minPathSum(int[][] grid, int rowIndex, int colIndex, int[][] mem) {
        int rowCount = grid.length;
        int colCount = grid[0].length;
        if(rowIndex >= rowCount || colIndex >= colCount)
            return Integer.MAX_VALUE;
        if(rowIndex == rowCount-1 && colIndex == colCount-1)
            return grid[rowIndex][colIndex];
        if(mem[rowIndex][colIndex] == 0) {
            int right = minPathSum(grid, rowIndex, colIndex + 1, mem);
            int down = minPathSum(grid, rowIndex + 1, colIndex, mem);
            mem[rowIndex][colIndex] = grid[rowIndex][colIndex]+Math.min(right, down);
        }
        return mem[rowIndex][colIndex];
    }
}
