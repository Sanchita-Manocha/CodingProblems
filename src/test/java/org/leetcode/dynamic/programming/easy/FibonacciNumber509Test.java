package org.leetcode.dynamic.programming.easy;

import org.junit.jupiter.api.Test;
import org.leetcode.dynamic.programming.easy.FibonacciNumber509;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciNumber509Test {
    FibonacciNumber509 sut = new FibonacciNumber509();

    @Test
    public void test1() {
        assertEquals(1, sut.fib(2));
        assertEquals(1, sut.fib1(2));
    }

    @Test
    public void test2() {
        assertEquals(2, sut.fib(3));
        assertEquals(2, sut.fib1(3));
    }

    @Test
    public void test3() {
        assertEquals(3, sut.fib(4));
        assertEquals(3, sut.fib1(4));
    }

}