package org.leetcode.easy.random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNote383Test {

    RansomNote383 sut = new RansomNote383();

    @Test
    public void test1() {
        assertFalse(sut.canConstruct("a", "b"));
        assertFalse(sut.canConstruct1("a", "b"));
    }
    @Test
    public void test2() {
        assertFalse(sut.canConstruct("aa", "ab"));
        assertFalse(sut.canConstruct1("aa", "ab"));
    }
    @Test
    public void test3() {
        assertTrue(sut.canConstruct("aa", "aab"));
        assertTrue(sut.canConstruct1("aa", "aab"));
    }
}