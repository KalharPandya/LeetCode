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
    boolean first = true;
    boolean ans = true;
    int lastNode;
    public void helper(TreeNode t){
        if(t == null)
            return;
        helper(t.left);
        if(!first && t.val <= lastNode) ans =  false;
        lastNode = t.val;
        first = false;
        helper(t.right);
    }
    public boolean isValidBST(TreeNode root) {
        
        helper(root);
        return ans;
    }
}