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
    boolean first = false;
    int lastNode = Integer.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        
        while (root!=null || !stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            
            if(first && root.val<=lastNode){
                return false;
            }
            first = true;
            lastNode = root.val;
            root = root.right;
            
        }
        return true;
    }
}