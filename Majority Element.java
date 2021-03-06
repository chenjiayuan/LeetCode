/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

==idea==
sort it first, then get the middle element
*/

public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int half = nums.length / 2;
        return nums[half];
    }
}