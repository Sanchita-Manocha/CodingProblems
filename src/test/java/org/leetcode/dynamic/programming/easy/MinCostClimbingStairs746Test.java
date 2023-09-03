package org.leetcode.dynamic.programming.easy;

import org.junit.jupiter.api.Test;
import org.leetcode.dynamic.programming.easy.MinCostClimbingStairs746;

import static org.junit.jupiter.api.Assertions.*;

class MinCostClimbingStairs746Test {

    MinCostClimbingStairs746 sut = new MinCostClimbingStairs746();

    @Test
    public void test1(){
        assertEquals(15, sut.minCostClimbingStairs(new int[]{10,15,20}));
    }

    @Test
    public void test2(){
        assertEquals(6, sut.minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }

}