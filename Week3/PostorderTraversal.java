/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        //This is could be done using a queue, or two stacks
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<Integer> stack2 = new Stack<Integer>();
        ArrayList<Integer> output = new ArrayList<Integer>();
        TreeNode current  = A;
        stack.push(current);
        //Push nodes on each level to the stack, while push the current node to stack 2
        while(!stack.isEmpty()) {
            current = stack.pop();
            stack2.push(current.val);
            if(current.left!=null) {
                stack.push(current.left);
            }
            if(current.right!=null) {
                stack.push(current.right);
            }
            
        }
        while(!stack2.isEmpty()){
            output.add(stack2.pop());
        }
        return output;
    }
}
