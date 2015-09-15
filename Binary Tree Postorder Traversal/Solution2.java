/*
Given a binary tree, return the postorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [3,2,1].

Note: Recursive solution is trivial, could you do it iteratively?

==idea==
iteration using stack (left -> right -> root)
pre-order traversal is root-left-right, and post order is left-right-root. modify the code for pre-order to make it root-right-left, and then reverse the output so that we can get left-right-root .

Create an empty stack, Push root node to the stack.
Do following while stack is not empty.

2.1. pop an item from the stack and print it.

2.2. push the left child of popped item to stack.

2.3. push the right child of popped item to stack.

reverse the ouput.
//Collections.reverse(result);

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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null) return result;
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.empty()) { //while the stack is not empty
            //pop an item from the stack and print it
            TreeNode tmp = stack.pop();
            result.add(tmp.val);
            //push the left child of popped item to stack.
            if (root.left != null) stack.push(root.left);
            //push the right child of popped item to stack.
            if (root.right != null) stack.push(root.right);
        }
        
        //reverse the list
        Collection.reverse(result);
        return result;
    }
}