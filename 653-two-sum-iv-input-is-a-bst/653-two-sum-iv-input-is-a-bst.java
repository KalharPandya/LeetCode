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

    List<Integer> inorder = new ArrayList<>();
    public void getOrder(TreeNode t){
        if (t==null) return;
        getOrder(t.left);
        inorder.add(t.val);
        getOrder(t.right);
    }
    public boolean findTarget(TreeNode root, int k) {
        getOrder(root);
        int firstPointer = 0;
        int lastPointer = inorder.size()-1;
        int sum ;
        while(firstPointer!=lastPointer){
            sum = inorder.get(firstPointer) + inorder.get(lastPointer);
            if(sum == k)    return true;
            if(sum < k) firstPointer++;
            else lastPointer--;
        }
        return false;
    }
}