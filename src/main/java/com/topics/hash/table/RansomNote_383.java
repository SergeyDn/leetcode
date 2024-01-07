package com.topics.hash.table;

import java.util.Map;
import java.util.stream.Collectors;

/*
383. Ransom Note (https://leetcode.com/problems/ransom-note/)

Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters
from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.


Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true

Constraints:
1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters.
*/
public class RansomNote_383 {
/*    public boolean canConstruct(String ransomNote, String magazine) {
        boolean canConstruct = true;
        Map<Character, Long> ransomNoteMap = ransomNote
                .chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        Map<Character, Long> magazineMap = magazine
                .chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        for (Map.Entry<Character, Long> e : ransomNoteMap.entrySet()) {
            if (!magazineMap.containsKey(e.getKey())
                    || magazineMap.get(e.getKey()).compareTo(e.getValue()) < 0) {
                canConstruct = false;
                break;
            }
        }

        return canConstruct;
    }*/


    //from leetcode
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) return false;
        int[] chars_counter = new int[26];

        for (char c : magazine.toCharArray()) {
            chars_counter[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (chars_counter[c - 'a'] == 0) return false;
            chars_counter[c - 'a']--;
        }

        return true;
    }

    public static void main(String[] args) {
        String first = "aa";
        String second = "aab";
        RansomNote_383 executor = new RansomNote_383();
        System.out.println(executor.canConstruct(first, second));
    }
}
