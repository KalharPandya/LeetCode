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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode r = head;
        ListNode l = head;
        for(int i = 0 ; i < n ; i ++){
            
            r= r.next;
        }
        if(r == null){
            return head.next;
        }
        while(r.next!=null){
            r = r.next;
            l = l.next;
         
        }
        if(l.next == null)
            return null;
        l.next = l.next.next;
        return head;
    }
}