/**
Given a binary tree, determine if it is height-balanced.

 Height-balanced binary tree : is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1. 
Return 0 / 1 ( 0 for false, 1 for true ) for this problem

Example :

Input : 
          1
         / \
        2   3

Return : True or 1 

Input 2 : 
         3
        /
       2
      /
     1

Return : False or 0 
         Because for the root node, left subtree has depth 2 and right subtree has depth 0. 
         Difference = 2 > 1. 
https://www.interviewbit.com/problems/balanced-binary-tree/


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
    public int isBalanced(TreeNode A) {
        // if(A==null)
        //     return 1;
        // int left = getHeight(A.left);
        // int right = getHeight(A.right);
        // if((Math.abs(left-right)<=1) && isBalanced(A.left)==1 && isBalanced(A.right)==1)
        //     return 1;
        // else
        //     return 0;
        Integer height = 0;
        return isBalanced(A, height)?1:0;
    }
    
    private static int getHeight(TreeNode node){
        if(node == null)
            return 0;
        return Math.max(getHeight(node.left),getHeight(node.right)) + 1;
    }
    
    public boolean isBalanced(TreeNode node, Integer height){
        if(node == null) {
            height = 0;
            return false;
        }
        Integer lHeight = 0;
        Integer rHeight = 0;
        boolean left = isBalanced(node.left,lHeight);
        boolean right = isBalanced(node.right,rHeight);
        height = Math.max(lHeight,rHeight)+1;
        
        if(Math.abs(lHeight-rHeight)>1)
            return false;
        else
            return left && right;
        
    }
    
}

