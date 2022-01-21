/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode r;
        r = head;
        while(r!=null){
            if(r.next!=null){
                r = r.next.next;
                head = head.next;
            }
            else break;
        }
        return head;
    }
}