package org.leetcode.dynamic.programming.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobber198Test {
    HouseRobber198 sut = new HouseRobber198();

    @Test
    public void test1() {
        assertEquals(12, sut.rob(new int[]{2, 7, 9, 3, 1}));
    }

    @Test
    public void test2() {
        assertEquals(4, sut.rob(new int[]{1, 2, 3, 1}));
    }

}