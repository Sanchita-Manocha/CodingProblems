package org.leetcode.dynamic.programming.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteAndEarn740Test {
    DeleteAndEarn740 sut = new DeleteAndEarn740();

    @Test
    public void test1(){
        assertEquals(6, sut.deleteAndEarn(new int[]{3,4,2}));
        assertEquals(6, sut.deleteAndEarn1(new int[]{3,4,2}));
    }

    @Test
    public void test2() {
        assertEquals(9, sut.deleteAndEarn(new int[]{2,2,3,3,3,4}));
        assertEquals(9, sut.deleteAndEarn1(new int[]{2,2,3,3,3,4}));
    }

    @Test
    public void test3() {
        assertEquals(18, sut.deleteAndEarn(new int[]{1,1,1,2,4,5,5,5,6}));
        assertEquals(18, sut.deleteAndEarn1(new int[]{1,1,1,2,4,5,5,5,6}));
    }

}