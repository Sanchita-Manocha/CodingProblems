package org.leetcode.dynamic.programming.medium;

import java.util.List;

/*
Given a triangle array, return the minimum path sum from top to bottom.

For each step, you may move to an adjacent number of the row below.
More formally, if you are on index i on the current row, you may move to either index i or index i + 1 on the next row.

 */
public class Triangle120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        Integer[][] mem = new Integer[triangle.size()][triangle.size()];
        return minimumTotal(triangle, 0, 0, mem);
    }

    private int minimumTotal(List<List<Integer>> triangle, int rowIndex, int colIndex, Integer[][] mem) {
        if (rowIndex >= triangle.size() || colIndex >= triangle.get(rowIndex).size()) {
            return 0;
        }
        if (mem[rowIndex][colIndex] == null) {
            mem[rowIndex][colIndex] = triangle.get(rowIndex).get(colIndex)
                    + Math.min(
                    minimumTotal(triangle, rowIndex + 1, colIndex, mem),
                    minimumTotal(triangle, rowIndex + 1, colIndex + 1, mem)
            );
        }
        return mem[rowIndex][colIndex];
    }
}
