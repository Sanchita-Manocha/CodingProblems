package org.leetcode.easy.random;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzz412Test {
    FizzBuzz412 sut = new FizzBuzz412();

    @Test
    public void test1(){
        List<String> expected = List.of("1","2","Fizz");
        assertEquals(expected, sut.fizzBuzz(3));
        assertEquals(expected, sut.fizzBuzz1(3));
    }
@Test
    public void test2(){
        List<String> expected = List.of("1","2","Fizz","4","Buzz");
        assertEquals(expected, sut.fizzBuzz(5));
        assertEquals(expected, sut.fizzBuzz1(5));
    }

    @Test
    public void test3() {
        List<String> expected = List.of("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz");
        assertEquals(expected, sut.fizzBuzz(15));
        assertEquals(expected, sut.fizzBuzz1(15));
    }

}