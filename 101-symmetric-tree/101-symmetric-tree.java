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
    public List<Integer> left = new ArrayList<>();
    public List<Integer> right = new ArrayList<>();
    void leftOrder(TreeNode t){
        if(t == null) {
            left.add(null);
            return;
        }
        leftOrder(t.left);
        leftOrder(t.right);
        left.add(t.val);
    }
    void rightOrder(TreeNode t){
        if(t == null) {
            right.add(null);
            return;
        }
        rightOrder(t.right);
        rightOrder(t.left);
        right.add(t.val);
    }
    public boolean isSymmetric(TreeNode root) {
        leftOrder(root.left);
        rightOrder(root.right);

        left.stream().forEach(integer -> System.out.print(integer + ", "));
        System.out.println();
        right.stream().forEach(integer -> System.out.print(integer + ", "));
        return left.equals(right);
    }
   
}