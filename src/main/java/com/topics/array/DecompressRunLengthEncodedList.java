package com.topics.array;

/*
We are given a list nums of integers representing a list compressed with run-length encoding.

Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  For each such pair,
there are freq elements with value val concatenated in a sublist. Concatenate all the sublists from left to right
to generate the decompressed list.

Return the decompressed list.

Example 1:
Input: nums = [1,2,3,4]
Output: [2,4,4,4]
Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
At the end the concatenation [2] + [4,4,4] is [2,4,4,4].

Example 2:
Input: nums = [1,1,2,3]
Output: [1,3,3]

Constraints:
 - 2 <= nums.length <= 100
 - nums.length % 2 == 0
 - 1 <= nums[i] <= 100
*/

import java.util.Arrays;

public class DecompressRunLengthEncodedList {
    // Variant 1
    /*public int[] decompressRLElist(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i = i + 2 ) {
            for (int j = 0; j < nums[i]; j++) {
                result.add(nums[i + 1]);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }*/

    // Variant 2
    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            size += nums[i];
        }

        int[] result = new int[size];

        int index = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            Arrays.fill(result, index, index + nums[i], nums[i + 1]);
            index += nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {55, 11, 70, 26, 62, 64};
        DecompressRunLengthEncodedList calculator = new DecompressRunLengthEncodedList();
        System.out.println(Arrays.toString(calculator.decompressRLElist(nums)));
    }
}
