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
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        HashMap<TreeNode,Integer> levelMap = new HashMap<TreeNode,Integer>();
        Queue<TreeNode> queue = (Queue<TreeNode>) new ArrayDeque<TreeNode>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        
        queue.add(A);
        levelMap.put(A,1);
        TreeNode current;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int previousLevel = 0;
        int currentLevel = 1;

        while(!queue.isEmpty()){
            //Take the root out
            current = queue.remove();
            currentLevel = levelMap.get(current);
            
            if(previousLevel<currentLevel){
                temp = new ArrayList<Integer>();
                res.add(temp);
                previousLevel = currentLevel;
            }
            temp.add(current.val);
            //Add new element to the queue and map
            if(current.left != null){
                queue.add(current.left);
                levelMap.put(current.left,currentLevel+1);
            }
            if(current.right != null){
                queue.add(current.right);
                levelMap.put(current.right,currentLevel+1);
            }
        }
        return res;
    
    }
}

