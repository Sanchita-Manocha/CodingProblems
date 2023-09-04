package org.leetcode.dynamic.programming.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniquePaths62Test {
    UniquePaths62 sut = new UniquePaths62();

    @Test
    public void test1(){
        assertEquals(28, sut.uniquePaths(3,7));
    }
    @Test
    public void test2(){
        assertEquals(3, sut.uniquePaths(3,2));
    }

}