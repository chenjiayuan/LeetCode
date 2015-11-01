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
iteratuve using stack
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
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode tmp = root;
    
        while(tmp !=null || !stack.empty()) {
            while(tmp != null){
                stack.add(tmp);
                tmp = tmp.left;
            } //go to farthest left

            tmp = stack.pop();
            result.add(tmp.val); //nothing on left, record the value
            tmp = tmp.right; //go right
        }
    
        return result;
    }
}