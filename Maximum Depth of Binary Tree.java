/*
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along
the longest path from the root node down to the farthest leaf node.

==idea==

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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null) {
            return maxDepth(root.right) + 1;
        } else if (root.right == null) {
            return maxDepth(root.left) + 1;
        } else {
            return Math.max(maxDepth(root.right), maxDepth(root.left)) + 1;
        }
    }
}
