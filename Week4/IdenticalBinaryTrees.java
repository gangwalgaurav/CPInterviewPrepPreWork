/**
Given two binary trees, write a function to check if they are equal or not.

Two binary trees are considered equal if they are structurally identical and the nodes have the same value.

Return 0 / 1 ( 0 for false, 1 for true ) for this problem

Example :

Input : 

   1       1
  / \     / \
 2   3   2   3

Output : 
  1 or True
See Expected Output
https://www.interviewbit.com/problems/identical-binary-trees/

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

    public int isSameTree(TreeNode A, TreeNode B) {
        
        if(A==null && B==null)
            return TRUE;
        if(A == null || B == null)
            return FALSE;
        if(A.val!=B.val)
            return FALSE;
        return (isSameTree(A.left,B.left) == TRUE) && ( isSameTree(A.right,B.right) ==TRUE)?TRUE:FALSE;
        
        
        
    }
}

