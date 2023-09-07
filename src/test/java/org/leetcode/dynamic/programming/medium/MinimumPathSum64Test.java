package org.leetcode.dynamic.programming.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumPathSum64Test {
    MinimumPathSum64 sut = new MinimumPathSum64();

    @Test
    public void test1() {
        int[][] input = new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        assertEquals(7, sut.minPathSum(input));
    }

    @Test
    public void test2() {
        int[][] input = new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        };
        assertEquals(12, sut.minPathSum(input));
    }

}