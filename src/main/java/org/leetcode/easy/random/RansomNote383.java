package org.leetcode.easy.random;

import java.util.HashMap;
import java.util.Map;

public class RansomNote383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            Character key = magazine.charAt(i);
            map.compute(key, (k, v) -> v == null ? 1 : v + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            Character key = ransomNote.charAt(i);
            if (!map.containsKey(key)) {
                return false;
            }
            int value = map.get(key);
            if (value == 1)
                map.remove(key);
            else
                map.put(key, value - 1);
        }
        return true;
    }
}
