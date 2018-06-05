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
    public int minDepth(TreeNode A) {
        return minDepth(A,0);
    }
    public int minDepth(TreeNode node, int currentDepth) {
        if(node==null)
            return currentDepth;
        else if(node.left == null && node.right == null)
            return currentDepth + 1;
        else if(node.left == null) {
            return minDepth(node.right, currentDepth+1);
        } else if (node.right == null) {
            return minDepth(node.left, currentDepth+1);
        }
        // System.out.println(currentDepth);
        return Math.min(minDepth(node.left, currentDepth+1),minDepth(node.right, currentDepth+1));
    }
}
