/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Node start = root;
        while(start!=null && start.left!=null ){
            Node nextHead = start.left;
            Node prev = null;
            Node cur = start;
            while(cur!=null){
                if(prev!=null) prev.right.next = cur.left;
                cur.left.next = cur.right;
                prev = cur;
                cur = cur.next;
            }
            start = nextHead;
        }
        return root;
    }
}