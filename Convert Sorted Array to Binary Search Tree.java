/*
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

==idea==
cut in half cut in half ()
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        return helper(nums, 0, nums.length-1);
    }
    
    public TreeNode helper(int[] nums, int lower, int upper) {
        if (lower > upper) return null;
        int mid = (lower+upper)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, lower, mid-1);
        root.right = helper(nums, mid+1, upper);
        
        return root;
    }
}