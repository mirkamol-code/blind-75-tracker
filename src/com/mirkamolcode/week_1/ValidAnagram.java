package com.mirkamolcode.week_1;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    /**
     *  @Time complexity: O(n log n + m log m)
     *  @Space complexity: O(n)
     * @param s
     * @param t
     */
    public boolean isAnagramBySorting(String s, String t) {
        char sChars[] = s.toCharArray();
        char tChars[] = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        String stext = Arrays.toString(sChars);
        String tText = Arrays.toString(tChars);
        return stext.equals(tText);
    }
    /**
     * @Time complexity: O(n + m)
     * @Space complexity: O(1)
     * @param s
     * @param t
     */
    public boolean isAnagramByHashMap(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }
        return countS.equals(countT);
    }
}
