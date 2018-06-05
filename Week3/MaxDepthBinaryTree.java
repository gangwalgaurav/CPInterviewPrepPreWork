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
    public int maxDepth(TreeNode A) {
        return maxDepth(A,0);
    }
    /**
     * currentDepth = max depth till now,
     */
    public int maxDepth(TreeNode node, int currentDepth) {
        if(node == null)
            return currentDepth;
        return Math.max(maxDepth(node.left, currentDepth+1),maxDepth(node.right, currentDepth+1));
    }
}
