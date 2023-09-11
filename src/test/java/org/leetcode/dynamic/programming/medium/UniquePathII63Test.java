package org.leetcode.dynamic.programming.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniquePathII63Test {
    UniquePathII63 sut = new UniquePathII63();

    @Test
    public void test1() {
        int[][] input = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        assertEquals(2, sut.uniquePathsWithObstacles(input));
    }

    @Test
    public void test2() {
        int[][] input = new int[][]{
                {0, 1},
                {0, 0}
        };
        assertEquals(1, sut.uniquePathsWithObstacles(input));
    }

}