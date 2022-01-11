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
    List<Integer> ans = new ArrayList<>();
    void travelPreOrder(TreeNode t){
        if(t == null){
            return;
        }
        ans.add(t.val);
        travelPreOrder(t.left);
        travelPreOrder(t.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        travelPreOrder(root);
        return ans;
    }
}