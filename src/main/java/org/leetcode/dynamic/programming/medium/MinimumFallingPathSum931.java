package org.leetcode.dynamic.programming.medium;

/*
Given an n x n array of integers matrix, return the minimum sum of any falling path through matrix.

A falling path starts at any element in the first row
and chooses the element in the next row that is either directly below or diagonally left/right.
Specifically, the next element from position
(row, col) will be (row + 1, col - 1), (row + 1, col), or (row + 1, col + 1).

 */
public class MinimumFallingPathSum931 {
    public int minFallingPathSum(int[][] matrix) {
        Integer[][] mem = new Integer[matrix.length][matrix[0].length];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix[0].length; i++)
            min = Math.min(min, minFallingPathSum(matrix, 0, i, mem));
        return min;
    }

    private int minFallingPathSum(int[][] matrix, int rowIndex, int colIndex, Integer[][] mem) {
        if (rowIndex == matrix.length - 1) {
            return matrix[rowIndex][colIndex];
        }
        if (mem[rowIndex][colIndex] == null) {
            if (colIndex == 0) {
                mem[rowIndex][colIndex] = matrix[rowIndex][colIndex] + Math.min(
                        minFallingPathSum(matrix, rowIndex + 1, colIndex, mem),
                        minFallingPathSum(matrix, rowIndex + 1, colIndex + 1, mem)
                );
            } else if (colIndex == matrix[0].length - 1) {
                mem[rowIndex][colIndex] = matrix[rowIndex][colIndex] + Math.min(
                        minFallingPathSum(matrix, rowIndex + 1, colIndex - 1,mem),
                        minFallingPathSum(matrix, rowIndex + 1, colIndex,mem)
                );
            } else {
                mem[rowIndex][colIndex] = matrix[rowIndex][colIndex] + Math.min(
                        minFallingPathSum(matrix, rowIndex + 1, colIndex - 1, mem),
                        Math.min(
                                minFallingPathSum(matrix, rowIndex + 1, colIndex + 1, mem),
                                minFallingPathSum(matrix, rowIndex + 1, colIndex, mem)
                        )
                );
            }
        }
        return mem[rowIndex][colIndex];
    }
}
