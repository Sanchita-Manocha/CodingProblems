package org.leetcode.dynamic.programming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TribonacciNumber1137Test {

    TribonacciNumber1137 sut = new TribonacciNumber1137();

    @Test
    public void test1() {
        assertEquals(4, sut.tribonacci(4));
        assertEquals(4, sut.tribonacci1(4));
    }

    @Test
    public void test2() {
        assertEquals(1389537, sut.tribonacci(25));
        assertEquals(1389537, sut.tribonacci1(25));
    }

}