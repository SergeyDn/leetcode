package com.topics.string;

/*
125. Valid Palindrome (https://leetcode.com/problems/valid-palindrome/)

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.


Constraints:
1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
*/
public class ValidPalindrome_125 {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        boolean isPalindrome = true;
        int a = 0, b = chars.length - 1;

        while (a <= b) {
            char firstChar = toLowerCase(chars[a]);
            char lastChar = toLowerCase(chars[b]);

            if (!isAlphanumericCharacterOrDigital(firstChar)) {
                a++;
            } else if (!isAlphanumericCharacterOrDigital(lastChar)) {
                b--;
            } else {
                if (firstChar != lastChar) {
                    isPalindrome = false;
                    break;
                }
                a++;
                b--;
            }
        }

        return isPalindrome;
    }

    private char toLowerCase(char c) {
        int shift = 'a' - 'A';
        if (c >= 'A' && c <= 'Z') {
            return (char) (c + shift);
        } else {
            return c;
        }
    }

    private boolean isAlphanumericCharacterOrDigital(char c) {
        return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }

    public static void main(String[] args) {
        String s = "0P";
        ValidPalindrome_125 executor = new ValidPalindrome_125();
        System.out.println(executor.isPalindrome(s));
    }
}
