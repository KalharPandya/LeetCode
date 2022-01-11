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
    int ans = 0;
    void travelPreOrder(TreeNode t, int level){
        if(t == null){
            return;
        }
        
        ans = Math.max(level, ans);
        travelPreOrder(t.left,level+1);
        travelPreOrder(t.right, level+1);
    }
    public int maxDepth(TreeNode root) {
        travelPreOrder(root,1);
        return ans;
    }
}