/**
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

Example :

    1
   / \
  2   2
 / \ / \
3  4 4  3
The above binary tree is symmetric. 
But the following is not:

    1
   / \
  2   2
   \   \
   3    3
Return 0 / 1 ( 0 for false, 1 for true ) for this problem
https://www.interviewbit.com/problems/symmetric-binary-tree/
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
    private static final int FALSE = 0;
    private static final int TRUE = 1;
    public int isSymmetric(TreeNode A) {
        if(A == null )
            return TRUE;
        return isSymmetric(A.left,A.right)?TRUE:FALSE;
        
    }
    public boolean isSymmetric(TreeNode A, TreeNode B) {
        if(A==null||B == null)
            return A == B;
        if(A.val != B.val)
            return false;
        return isSymmetric(A.left,B.right) && isSymmetric(A.right,B.left);
    }
}

