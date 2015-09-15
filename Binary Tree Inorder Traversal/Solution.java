/*
Given a binary tree, return the inorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,3,2].

Note: Recursive solution is trivial, could you do it iteratively?

==idea==
recursive vs iterative
recursive:
left node -> add the current node to list -> right node
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> reuslt = new ArrayList<>();
        helper(root, res);
        return result;
    }

    //a helper for recurision
    private void helper(TreeNode root, List<Integer> result) {
        if (root != null) {
            if (root.left != null) {
                helper(root.left, result);
            }
            res.add(root.val);
            if (root.right != null) {
                helper(root.right, result);
            }
        } //if root == null, do nothing
    } //return nothing
}