package org.leetcode.dynamic.programming.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Triangle120Test {
    Triangle120 sut = new Triangle120();

    @Test
    public void test1() {
        List<List<Integer>> input = List.of(
                List.of(2),
                List.of(3, 4),
                List.of(6, 5, 7),
                List.of(4, 1, 8, 3)
        );
        assertEquals(11, sut.minimumTotal(input));
    }

    @Test
    public void test2() {
        List<List<Integer>> input = List.of(
                List.of(-10)
        );
        assertEquals(-10, sut.minimumTotal(input));
    }

}