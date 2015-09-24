/*
Given an array and a value, remove all instances of that value in place and return the new length.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

==idea==
read code
*/

public class Solution {
    public int removeElement(int[] nums, int val) {
        int m = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                //move non-val elements left, index m
                nums[m] = nums[i];
                m++;
            }
        }
        return m;
    }
}

//example: nums = [1,2,3,2,1,5,2], val = 2
// return: length = 4, nums = [1,3,1,5,2,2,2]