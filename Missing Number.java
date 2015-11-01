/*
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.

Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?

==idea==
simple since we are told that we are missing only one number in [1,n], 
we just need to look at the difference between the sum([1,n]) = n * (n+1) / 2 
and the sum of nums in our array.
*/

public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int allSum = (1 + nums.length)*nums.length/2;
        return allSum - sum;
    }
}