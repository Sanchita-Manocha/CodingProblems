package org.leetcode.dynamic.programming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClimbingStairs70Test {
    ClimbingStairs70 sut = new ClimbingStairs70();

    @Test
    public void test1(){
        assertEquals(2, sut.climbStairs(2));
        assertEquals(2, sut.climbStairs1(2));
    }
    @Test
    public void test2(){
        assertEquals(3, sut.climbStairs(3));
        assertEquals(3, sut.climbStairs1(3));
    }
    @Test
    public void test3(){
        assertEquals(1, sut.climbStairs(1));
        assertEquals(1, sut.climbStairs1(1));
    }

}