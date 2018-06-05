/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode getSuccessor(TreeNode a, int b) {
        TreeNode successor = null;
        TreeNode ancestor = a;
        while(ancestor.val!=b) {
            if(ancestor.val<b){
                ancestor = ancestor.right;
            } else {
                successor = ancestor;
                ancestor = ancestor.left;
            }
        }
        TreeNode temp = ancestor.right;
        if(temp == null)
            return successor;
        while(temp.left!=null) {
            temp = temp.left;
        }
        return temp;
        
        
    }
}
