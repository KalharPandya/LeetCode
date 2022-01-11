/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int target = 0;
    boolean checkSum(TreeNode t, int csum){
        if(t==null) return false;
            csum += t.val;
        if(t.left == null && t.right == null){
            return csum == target;
        }
        return checkSum(t.left, csum) || checkSum(t.right, csum);
        
    }
     public boolean hasPathSum(TreeNode root, int targetSum) {
        target = targetSum;
         return checkSum(root,0);
    }
}