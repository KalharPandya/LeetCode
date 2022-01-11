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
    void travelInOrder(TreeNode t){
        if(t == null){
            return;
        }
        
        travelInOrder(t.left);
        ans.add(t.val);
        travelInOrder(t.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        travelInOrder(root);
        return ans;
    }
}