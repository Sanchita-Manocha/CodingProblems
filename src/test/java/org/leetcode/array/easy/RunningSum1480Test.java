package org.leetcode.array.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunningSum1480Test {

    RunningSum1480 sut = new RunningSum1480();

    @Test
    public void test1() {
        int[] input = new int[]{1, 2, 3, 4};
        int[] expected = new int[]{1, 3, 6, 10};
        assertArrayEquals(expected, sut.runningSum(input));
        assertArrayEquals(expected, sut.runningSum1(input));
    }

    @Test
    public void test2() {
        int[] input = new int[]{1, 1, 1, 1, 1};
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertArrayEquals(expected, sut.runningSum(input));
        assertArrayEquals(expected, sut.runningSum1(input));
    }

    @Test
    public void test3() {
        int[] input = new int[]{3, 1, 2, 10, 1};
        int[] expected = new int[]{3, 4, 6, 16, 17};
        assertArrayEquals(expected, sut.runningSum(input));
        assertArrayEquals(expected, sut.runningSum1(input));
    }

}