package com.topics.array;

/*
209. Minimum Size Subarray Sum (https://leetcode.com/problems/minimum-size-subarray-sum/)

Given an array of positive integers nums and a positive integer target, return the minimal length of a
subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.


Example 1:
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.

Example 2:
Input: target = 4, nums = [1,4,4]
Output: 1

Example 3:
Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0


Constraints:
1 <= target <= 109
1 <= nums.length <= 105
1 <= nums[i] <= 104
*/
public class MinimumSizeSubarraySum_209 {
    // Описание https://leetcode.com/problems/minimum-size-subarray-sum/solutions/3724641/2-approaches-100-fast-binary-serarch-sliding-window-easy-line-by-line-video-explanation/?envType=study-plan-v2&envId=top-interview-150
    public int minSubArrayLen(int target, int[] nums) {
        int res = nums.length + 1;

        int left = 0;
        int right = 0;
        int sum = 0;

        while (right < nums.length) {
            sum += nums[right];

            while (sum >= target) {
                res = Math.min(right - left + 1, res);
                sum -= nums[left];
                left++;
            }
            right++;
        }

        if (res > nums.length) return 0;

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        MinimumSizeSubarraySum_209 executor = new MinimumSizeSubarraySum_209();
        System.out.println(executor.minSubArrayLen(target, nums));
    }
}
