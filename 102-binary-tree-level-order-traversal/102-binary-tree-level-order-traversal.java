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
    List<List<Integer>> ans = new ArrayList<>();
    void travelPreOrder(TreeNode t, int level){
        if(t == null){
            return;
        }
        if(level >= ans.size()){
            ans.add(new ArrayList<>());
        }
        ans.get(level).add(t.val);
        travelPreOrder(t.left,level+1);
        travelPreOrder(t.right, level+1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        travelPreOrder(root,0);
        return ans;
    }
}