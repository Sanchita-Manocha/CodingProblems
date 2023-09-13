package org.leetcode.dynamic.programming.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumFallingPathSum931Test {
    MinimumFallingPathSum931 sut = new MinimumFallingPathSum931();

    @Test
    public void test1() {
        int[][] matrix = new int[][]{
                {2, 1, 3},
                {6, 5, 4},
                {7, 8, 9}
        };
        assertEquals(13, sut.minFallingPathSum(matrix));
    }

    @Test
    public void test2() {
        int[][] matrix = new int[][]{
                {-19,57},
                {-40,-5}
        };
        assertEquals(-59, sut.minFallingPathSum(matrix));
    }

    @Test
    public void test3() {
        int[][] matrix = new int[][]{
                {-48}
        };
        assertEquals(-48, sut.minFallingPathSum(matrix));
    }

}