package org.leetcode.easy.random;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz412 {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0)
                result.add("FizzBuzz");
            else if (i % 3 == 0)
                result.add("Fizz");
            else if (i % 5 == 0)
                result.add("Buzz");
            else
                result.add(String.valueOf(i));
        }
        return result;
    }
    public List<String> fizzBuzz1(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String resultString ="";
            if (i % 3 == 0)
                resultString+="Fizz";
            if (i % 5 == 0)
                resultString+="Buzz";
            if(resultString.isEmpty())
                resultString+=String.valueOf(i);
            result.add(resultString);
        }
        return result;
    }
}
