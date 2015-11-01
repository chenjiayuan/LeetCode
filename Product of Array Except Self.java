/*
Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Solve it without division and in O(n).

For example, given [1,2,3,4], return [24,12,8,6].

Follow up:
Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)

==idea==
An explanation of polygenelubricants method is: The trick is to construct the arrays (in the case for 4 elements)

{              1,         a[0],    a[0]*a[1],    a[0]*a[1]*a[2],  }
{ a[1]*a[2]*a[3],    a[2]*a[3],         a[3],                 1,  }
Both of which can be done in O(n) by starting at the left and right edges respectively.

Then multiplying the two arrays element by element gives the required result
*/

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        
        //multiply from left
        result[0] = 1;
        for (int i=1; i<nums.length; i++) {
            result[i] = result[i-1] * nums[i-1];
        }
        //multiply from right
        int right = 1;
        for (int i = nums.length-1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }
        
        return result;
    }
}