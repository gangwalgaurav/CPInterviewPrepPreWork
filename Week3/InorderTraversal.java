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
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        ArrayList<Integer> output = new ArrayList<Integer>();
        TreeNode current  = A;
        //Traverse till current is null or all nodes are processed.
        while(current!=null || !stack.isEmpty()) {
            //Add current node to stack
            if(current!=null) {
                stack.push(current);
                current = current.left;
                continue;
            }
            current = stack.pop();
            if(current.right!=null)
                current  = current.right;
            continue;
        }
        output.add(current.val);
        
    }
    return output;
}
}
