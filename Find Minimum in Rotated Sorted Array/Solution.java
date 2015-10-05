/*
Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.

==idea==
The minimum element must satisfy one of two conditions: 
1) If rotate, A[min] < A[min - 1]; 
2) If not, A[0]. 
Therefore, we can use binary search: 
check the middle element, if it is less than previous one, 
then it is minimum. If not, there are 2 conditions as well: 
If it is greater than both left and right element, 
then minimum element should be on its right, otherwise on its left.

*/

public class Solution {
    public int findMin(int[] nums) {
        //binary search solution
        int low = 0, high = nums.length-1;
        if (nums[high] > nums[low]) return nums[0]; //no rotation
        
        while (high - low > 1) {
            int mid = (low + high) / 2;
            if (nums[mid] < nums[low]) {
                high = mid; // min on left
            } else {
                low = mid;
            }
        }
        return Math.min(nums[low], nums[high]);
        
        /* traverse solution
        for(int i=0; i<nums.length; i++) {
            if (result > nums[i]) result = nums[i];
        }
        */
    }
}