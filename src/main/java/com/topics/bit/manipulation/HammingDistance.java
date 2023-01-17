package com.topics.bit.manipulation;

/*
461. Hamming Distance (https://leetcode.com/problems/hamming-distance/)

The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, return the Hamming distance between them.

Example 1:
Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
The above arrows point to positions where the corresponding bits are different.

Example 2:
Input: x = 3, y = 1
Output: 1


Constraints:
0 <= x, y <= 231 - 1
*/

public class HammingDistance {

/*
    №1
    public int hammingDistance(int x, int y) {
        char[] xor = Integer.toBinaryString(x ^ y).toCharArray();
        int count = 0;
        for (char c : xor) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }*/

/*  №2
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }*/

    // №3
    public int hammingDistance(int x, int y) {
        int count = 0;
        int xor = x ^ y;
        while (xor != 0) {
            // check that xor is odd
            if ((xor & 1) == 1) {
                count++;
            }
            xor = xor >> 1;
        }

        return count;
    }


    public static void main(String[] args) {
        HammingDistance calculator = new HammingDistance();
        System.out.println(calculator.hammingDistance(3, 1));
    }
}
