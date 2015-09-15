/*
Given a binary tree, return the preorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,2,3].

Note: Recursive solution is trivial, could you do it iteratively?

==idea==
recurison using helper (root -> left -> right)
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        helper(root, result);
        return result;
    }

    //use a helper in recursion
    public void helper(TreeNode root, List<Intege> result) {
        if (root != null) {
            result.add(root.val);
            helper(root.left, result);
            helper(root.right, result);
        } else return;
    }
}