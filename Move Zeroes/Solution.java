/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.

==idea==
move non-zero elements to front
*/

public class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int tmp = 0;
        for (int i = 1; i < len; i++) {
            if (nums[i] != 0) {
                int j = i;
                while(nums[j-1] == 0) {
                    tmp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = tmp;
                    j--;
                    if (j == 0) break;
                }
            }
        }
    }
}
