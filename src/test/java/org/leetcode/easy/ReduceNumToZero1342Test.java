package org.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReduceNumToZero1342Test {
    ReduceNumToZero1342 sut = new ReduceNumToZero1342();

    @Test
    public void test1(){
        assertEquals(6, sut.numberOfSteps(14));
    }
@Test
    public void test2(){
        assertEquals(4, sut.numberOfSteps(8));
    }

    @Test
    public void test3() {
        assertEquals(12, sut.numberOfSteps(123));
    }

}