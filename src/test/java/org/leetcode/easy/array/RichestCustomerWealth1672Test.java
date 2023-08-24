package org.leetcode.easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RichestCustomerWealth1672Test {

    RichestCustomerWealth1672 sut = new RichestCustomerWealth1672();

    @Test
    public void test1() {
        int[][] input = new int[][]{
                {1, 2, 3},
                {3, 2, 1}
        };
        assertEquals(6, sut.maximumWealth(input));
    }

    @Test
    public void test2() {
        int[][] input = new int[][]{
                {1, 5},
                {7, 3},
                {3, 5}
        };
        assertEquals(10, sut.maximumWealth(input));
    }

    @Test
    public void test3() {
        int[][] input = new int[][]{
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}
        };
        assertEquals(17, sut.maximumWealth(input));
    }

}