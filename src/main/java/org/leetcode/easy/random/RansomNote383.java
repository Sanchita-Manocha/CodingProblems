package org.leetcode.easy.random;

import java.util.HashMap;
import java.util.Map;

public class RansomNote383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length())
            return false;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char key = magazine.charAt(i);
            int value = map.getOrDefault(key, 0);
            map.put(key, value + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char key = ransomNote.charAt(i);
            int value = map.getOrDefault(key, 0);
            if (value == 0) {
                return false;
            }
            map.put(key, value - 1);
        }
        return true;
    }

    public boolean canConstruct1(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length())
            return false;
        for (int i = 0; i < ransomNote.length(); i++) {
            char character = ransomNote.charAt(i);
            int index = magazine.indexOf(character);
            if(index == -1)
                return false;
            magazine = magazine.substring(0, index)+magazine.substring(index+1);
        }
        return true;
    }
}
