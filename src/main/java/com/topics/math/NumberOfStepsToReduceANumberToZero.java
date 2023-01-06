package com.topics.math;

/*
Given an integer num, return the number of steps to reduce it to zero.

In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

Example 1:
Input: num = 14
Output: 6
Explanation:
Step 1) 14 is even; divide by 2 and obtain 7.
Step 2) 7 is odd; subtract 1 and obtain 6.
Step 3) 6 is even; divide by 2 and obtain 3.
Step 4) 3 is odd; subtract 1 and obtain 2.
Step 5) 2 is even; divide by 2 and obtain 1.
Step 6) 1 is odd; subtract 1 and obtain 0.

Example 2:
Input: num = 8
Output: 4
Explanation:
Step 1) 8 is even; divide by 2 and obtain 4.
Step 2) 4 is even; divide by 2 and obtain 2.
Step 3) 2 is even; divide by 2 and obtain 1.
Step 4) 1 is odd; subtract 1 and obtain 0.
Example 3:

Input: num = 123
Output: 12

Constraints: 0 <= num <= 106
*/

public class NumberOfStepsToReduceANumberToZero {
    private int steps = 0;

    /*public int numberOfSteps(int num) {
        while (num != 0) {
            num = num % 2 == 0 ? num / 2 : num - 1;
            steps++;
        }
        return steps;
    }*/

     public int numberOfSteps(int num) {
        if (num == 0) {
            return steps;
        }

        steps++;

        if (num % 2 == 0) {
            numberOfSteps(num / 2);
        } else {
            numberOfSteps(num -= 1);
        }

        return steps;
    }

     /* Solutions from leetcode:
     https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/solutions/2604706/java-explained-in-detail-bit-manipulation-math-iterative-recursive/?orderBy=most_votes
     also https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/solutions/907422/java-0ms-1-liner-avoid-recursion-iteration-with-integer-library/?orderBy=most_votes
     */

    public static void main(String[] args) {
        int number = 8;
        NumberOfStepsToReduceANumberToZero numberOfStepsToReduceANumberToZero = new NumberOfStepsToReduceANumberToZero();
        System.out.println(numberOfStepsToReduceANumberToZero.numberOfSteps(number));
    }
}
