package org.leetcode.dynamic.programming.medium;

/*
You are given an m x n integer array grid. There is a robot initially located at the top-left corner (i.e., grid[0][0]).
The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]).
The robot can only move either down or right at any point in time.

An obstacle and space are marked as 1 or 0 respectively in grid.
A path that the robot takes cannot include any square that is an obstacle.

Return the number of possible unique paths that the robot can take to reach the bottom-right corner.
 */
public class UniquePathII63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] mem = new int[obstacleGrid.length + 1][obstacleGrid[0].length];
        return uniquePathsWithObstacles(obstacleGrid, 0, 0, mem);
    }

    private int uniquePathsWithObstacles(int[][] obstacleGrid, int rowIntex, int colIndex, int[][] mem) {
        int rowCount = obstacleGrid.length;
        int colCount = obstacleGrid[0].length;
        if (rowIntex >= rowCount || colIndex >= colCount || obstacleGrid[rowIntex][colIndex] == 1)
            return 0;
        if (rowIntex == rowCount - 1 && colIndex == colCount - 1)
            return 1;
        if (mem[rowIntex][colIndex] == 0) {
            int down = uniquePathsWithObstacles(obstacleGrid, rowIntex + 1, colIndex, mem);
            int right = uniquePathsWithObstacles(obstacleGrid, rowIntex, colIndex + 1, mem);
            mem[rowIntex][colIndex] = down + right;
        }
        return mem[rowIntex][colIndex];
    }
}
