package com.topics.string;

/*
Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

Example 1:
Input: s = "Hello"
Output: "hello"

Example 2:
Input: s = "here"
Output: "here"
Example 3:

Input: s = "LOVELY"
Output: "lovely"

Constraints:

 - 1 <= s.length <= 100
 - s consists of printable ASCII characters.
*/
public class ToLowerCase {
    /*public String toLowerCase(String s) {
        return s.toLowerCase();
    }*/

    public String toLowerCase(String s) {
        char[] chars = s.toCharArray();
        int shift = 'a' - 'A';

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + shift);
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "Hello";
        ToLowerCase toLowerCase = new ToLowerCase();
        System.out.println(toLowerCase.toLowerCase(s));
    }
}
