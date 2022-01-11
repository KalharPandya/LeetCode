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
    TreeNode l;
    TreeNode findIt(TreeNode t){
        if(t==null) return null;
        
        if(t.val == target) return t;
        
        l = findIt(t.left);
        if(l==null)    
            return findIt(t.right);
        return l;
        
    }
    public TreeNode searchBST(TreeNode root, int val) {
        target = val;
        return findIt(root);
    }
}